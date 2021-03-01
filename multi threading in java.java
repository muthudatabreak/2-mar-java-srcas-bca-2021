package demotest;
 
public class GuruThread1 implements Runnable
{
       public static void main(String[] args) {
        Thread gThread1 = new Thread("abi1");
        Thread g1Thread2 = new Thread("shek2");
        gThread1.start();
        g1Thread2.start();
        System.out.println("Thread names are following:");
        System.out.println(gThread1.getName());
        System.out.println(g1Thread2.getName());
    }
    @Override
    public void run() {
    }
 
}
