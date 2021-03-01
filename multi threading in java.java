// https://www.w3schools.com/java/tryjava.asp?filename=demo_interface_multi
public class Main implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This is abishek inside program");
  }
  public void run() {
    System.out.println("This code is abishek outside program");
  }
}
