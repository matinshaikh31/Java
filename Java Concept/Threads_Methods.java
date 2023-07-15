class Mythr1 extends Thread {

    @Override
    public void run() {
int i =0;
        while(i<50) {
            System.out.println("hi ");

            i++;
        }

    }
}
class Mythr3 extends Thread {

    @Override
    public void run() {
int i=0;
        while(i<50) {
            System.out.println("GO ");
            i++;
        }
    }
}


public class Threads_Methods {
    public static void main(String[] args) {
        Mythr1 MT1 = new Mythr1();
        Mythr3 MT3 = new Mythr3();
 MT1.start();
// try{
//     MT1.join();
// }
// catch (Exception e){
//     System.out.println(e);
//
// }
try {
    MT1.sleep(5000);
}
catch (Exception e){
    System.out.println(e);
}
 MT3.start();


    }
}
