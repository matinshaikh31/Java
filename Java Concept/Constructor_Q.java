//Q1//

class Cyclinder {
     private int radius;
    private int Height;


    public Cyclinder(int Height, int radius){
        this.Height=Height;
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }
    public double surface_area(){
        return (int) ((2*3.14*radius*radius) + (2*3.14*radius*Height));
    }

public double volume(){
        return 3.14 * radius *radius * Height;
}
}


class Rectangle1{
    private int length;
    private int breath;

    public Rectangle1(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }
}




public class Constructor_Q {
    public static void main(String[] args) {


        //Q1//
         Cyclinder CY = new Cyclinder(12,9);
//        CY.setHeight(12);
//        CY.setRadius(9);
        System.out.println(CY.getHeight());
        System.out.println(CY.getRadius());


        //Q2
        System.out.println(CY.surface_area());
        System.out.println(CY.volume());



        //Q3
        Rectangle1 RT = new Rectangle1(23,4);

        System.out.println(RT.getLength());
        System.out.println(RT.getBreath());




    }
}
