


class Mythr extends Thread{
    Mythr(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("hi");
    }
}


class Mythr2 extends Thread{

    Mythr2(String name,Runnable r ){

    }

    @Override
    public void run() {
        System.out.println("Hi");
    }
}


public class Thread_Constructor {

    public static void main(String[] args) {

        Mythr t = new Mythr("Matin");
        t.start();
        System.out.println(t.getName()
        );
        System.out.println(t.threadId());


    }
}
