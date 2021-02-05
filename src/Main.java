public class Main {
    public static void main(String []args)
    {
         Thread t=new MyThread();
         t.start();
         for(int i=1;i<=999999998;i++)
         {

             System.out.println("新年新对象，年年不一样");
         }
    }
}
class MyThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=999999998;i++)
        {

            System.out.println("新年快乐，孤寡孤寡");
        }
    }
}
