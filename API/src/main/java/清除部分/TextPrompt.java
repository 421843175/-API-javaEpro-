package �������;


public class TextPrompt {
    public static void main(String[] args) {

        Prompt p= new Prompt(50) {

            @Override
            public void init() {
                //��ʼ����Դ
                int g=10;



            preString("����Դ�Ѿ�������:");
            for(int j=0;j<getPro();j++) {

//                jz(j);
                jz(j,"#");
                endString("���ؽ��� "+(j+1)+"/"+getPro()+"���ɹ�");


                //                �����¼��߼�  �˴���ѭ����ʱΪ��
                try {
                    Thread.sleep(200);
                    int a=20/g--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //�����Ǽ����쳣�Ĵ����߼�
                catch (ArithmeticException e){
                   print("�����쳣"+e.getMessage()+",����ʧ��");
                   setProExption();
                   break;
                }

                if(ifEnd(j))
                {
                  print("���سɹ�");
                    break;
                }
            }
            }

        };
        if(p.isProExption())return;
        System.out.println("���غ���߼�");

    }

}
