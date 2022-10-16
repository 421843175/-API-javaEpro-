package 清除部分;


abstract public class Prompt{
        //    进度空格
        private int pro=20;
        private int nowpro=0;
        private int deletechar=0;

        //出现异常时设置值
        private boolean proExption=false;

    public boolean isProExption() {
        return proExption;
    }

    public void setProExption() {
        this.proExption = true;
    }

    public int getPro() {
        return pro;
    }

    public void setPro(int pro) {
        this.pro = pro;
    }

    abstract public   void init();



//       abstract public  void init(String prestr,String str);
//       {
//           defaultString(prestr);
//           int b=100/pro;
//           for(int j=0;j<pro;j++) {
//
//               jz((j+1)*b,str);
//               try {
//                   Thread.sleep(500);
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }
//               if(j==pro-1)break;
//               bpri();
//           }
//       }


        public Prompt(){
            init();
        }
/**
 * @param a: 设置进度
 * @return
 * @date: 2022/10/15 21:21
 */
        public Prompt(int a){
            this.pro=a;
            init();
        }

//        废弃的方法
        public String addpro(){
            String restr="";
            ++nowpro;
            restr+="[";
            for(int i=0;i<nowpro;i++)restr+="■";
            for(int i=0;i<pro-nowpro;i++)restr+=" ";
            restr+="]";
            return restr;
        }

        public String addpro(String str){
            String restr="";
            ++nowpro;
            restr+="[";
            for(int i=0;i<nowpro;i++)restr+=str;
            for(int i=0;i<pro-nowpro;i++)restr+=" ";
            restr+="]";
            return restr;
        }
        public void preString(String a){
            deletechar=0;
            System.out.print(a);

//            System.out.print("[");
//            for(int i=0;i<pro;i++) System.out.print(" ");
//            System.out.print("]");

        }


        private void bpri(){
            for(int i=0;i<this.deletechar;i++)
                System.out.print("\b");

        }


    //    加载
        public void jz(int pr){
            pr=(pr+1)*(100/getPro());
                int n=0;
            System.out.print(pr+"%");
            String adp = addpro("■");
            System.out.print(adp);
            while(pr!=0) {
                n++;
                pr=pr/10;
            }
            this.deletechar=adp.length()+n+1;

        }

        /**
         * @param pr:进度情况，一般传入循环次数
         * @param str: 加载的符号表示
         * @return
         * @date: 2022/10/15 21:44
         */
       public void jz(int pr,String str){
           pr=(pr+1)*(100/getPro());
           int n=0;
           System.out.print(pr+"%");
           String adp = addpro(str);
           System.out.print(adp);
           while(pr!=0) {
               n++;
               pr=pr/10;
           }
           this.deletechar=adp.length()+n+1;

       }

       /**
        * @param str: 加载条后的提示信息
        * @return
        * @date: 2022/10/15 21:48
        */
       public void endString(String str){
           System.out.print(str);
           this.deletechar+=str.length();
       }

       /**
        * @param a:
        * @return 返回是否结束资源处理
        * @date: 2022/10/16 9:23
        */
       public boolean ifEnd(int a){
           if(a==getPro()-1)return true;
           bpri();
          return false;
       }

       /**
        * @param str: 提示子串
        * @return 加载成功与失败的简协信息
        * @date: 2022/10/16 9:40
        */
       public void print(String str){
           System.out.println();
           System.out.println(str);
       }


    }


