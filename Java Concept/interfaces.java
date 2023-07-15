
interface Bicycle{
    void Break(int dec);
    void speedup(int incre);
}
interface  horn{
   public  void horn1();
   public void horn2();

}


class AvonCycle implements Bicycle, horn{
    @Override
    public void Break(int dec) {
        System.out.println("Stop");

    }

    @Override
    public void speedup(int incre) {
        System.out.println("25km");
    }

    @Override
    public void horn1() {
        System.out.println("pepe");
    }

    @Override
    public void horn2() {
        System.out.println("popo");
    }
}


public class interfaces {
    public static void main(String[] args) {


        

        AvonCycle c = new AvonCycle();
        c.Break(1);
        c.horn1();
        
    }
}
