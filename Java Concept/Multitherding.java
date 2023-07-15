class Thread1 extends Thread {
    @Override
    public void run() {


        while (true) {
            System.out.println("Thread1 is Cooking");
            System.out.println("I am Happy");
        }


    }

    class Mythr3 implements Runnable {
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
}


class Thread2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread1 is Chatting");
            System.out.println("I am sad");

        }
    }
}

public class Multitherding {
    public static void main(String[] args) {

        Thread1 t1 =  new Thread1();
        Thread2 t2 = new Thread2();

t1.start();
t2.start();

    }
}
