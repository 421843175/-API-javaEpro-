package 清除部分;


public class TextPrompt {
    public static void main(String[] args) {

        Prompt p= new Prompt(50) {

            @Override
            public void init() {
                //初始化资源
                int g=10;



            preString("该资源已经加载了:");
            for(int j=0;j<getPro();j++) {

//                jz(j);
                jz(j,"#");
                endString("下载进度 "+(j+1)+"/"+getPro()+"，成功");


                //                处理事件逻辑  此处以循环耗时为例
                try {
                    Thread.sleep(200);
                    int a=20/g--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //这里是加载异常的处理逻辑
                catch (ArithmeticException e){
                   print("出现异常"+e.getMessage()+",加载失败");
                   setProExption();
                   break;
                }

                if(ifEnd(j))
                {
                  print("加载成功");
                    break;
                }
            }
            }

        };
        if(p.isProExption())return;
        System.out.println("下载后的逻辑");

    }

}
