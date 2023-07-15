class Mythr12 extends Thread {
    Mythr12(String name) {
        super(name);
    }

    @Override
    public void run() {

        while(true) {
            System.out.println("hi " + this.getName());
        }
    }
}



public class Thread_priorites {
    public static void main(String[] args) {
        Mythr12 t = new Mythr12("Matin");
        Mythr12 t2 = new Mythr12("Matin2");
       ;
        Mythr12 t3 = new Mythr12("Matin3");
        Mythr12 t4 = new Mythr12("Matin4");
        Mythr12 t5 = new Mythr12("Matin5  (Most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
