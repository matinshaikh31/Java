

class Runable2 implements  Runnable{
    @Override
    public void run() {
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
        System.out.println("I am Thread2 of Runabl2");
    }
}


class Runable1 implements  Runnable{
     @Override

     public void run() {
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
         System.out.println("I am Thread1 of Runabl1");
     }
 }



public class MultiThread_Runable_intrearface {
    public static void main(String[] args) {
    Runable1 Bullet1 = new Runable1();
    Thread Gun1 = new Thread(Bullet1);


    Runable2 Bullet2 = new Runable2();
    Thread Gun2 = new Thread(Bullet2);

Gun1.start();
Gun2.start();

    }
}
