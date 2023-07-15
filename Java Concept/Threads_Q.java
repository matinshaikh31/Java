
                //Q1//
//class Thrd extends Thread{
//    @Override
//    public void run() {
//        int i = 0;
//        while ( i<10){
//
//            System.out.println("Good Morning");
//
//            i++;
//        }
//    }
//
//}
//class Thrd2 extends Thread{
//    @Override
//    public void run() {
//        int i = 0;
//        while ( i<10){
//
//            System.out.println("Welcome");
//
//            i++;
//        }
//    }
//
//}


//Q2//

//class Thrd extends Thread{
//    @Override
//    public void run() {
//        int i = 0;
//        while ( i<10){
//
//            System.out.println("Good Morning");
//
//            i++;
//        }
//    }
//
//}
//class Thrd2 extends Thread{
//    @Override
//    public void run() {
//        int i = 0;
//        while ( i<10){
//
//            System.out.println("Welcome");
//
//            i++;
//        }
//    }
//
//}

                //Q3//
class Thrd extends Thread{
    Thrd(String name){
        super(name);

    }
                    @Override


                    public void run() {
                        int i = 0;
                        while ( i<10){

                            System.out.println("Good Morning" + getName());

                            i++;
                        }
                    }

                }




public class Threads_Q {
    public static void main(String[] args) {
              //  Q1 //
//
//        Thrd t = new Thrd();
//        Thrd2 t2 = new Thrd2();
//
//        t.start();
//        t2.start();

//    }
//
        //Q2//
//        Thrd t = new Thrd();
//
//        Thrd2 t2 = new Thrd2();
//        t.start();
//        try{
//            t.sleep(2000);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        t2.start();

  //Q3//
        Thrd t = new Thrd("M1");
        Thrd t2 = new Thrd("M2");
        Thrd t3 = new Thrd("M3");
        Thrd t4 = new Thrd("M4");

       t4.setPriority(10);
       t.setPriority(1);
       t2.setPriority(5);
       t3.setPriority(10);
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t.getPriority());
        System.out.println(t4.getPriority());
        t.start();
        t2.start();
        t3.start();
        t4.start();







    }
}
