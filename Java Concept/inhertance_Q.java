class circle{
    int radius;

    circle(int r){
        System.out.println("I am Circle constructor");
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    double area(){
        return 3.14 * this.radius * this.radius;

    }
}
class Cyliender1 extends circle{
    int height;
    Cyliender1(int r,int h){

        super(r);
        this.height = h;

    }

    public int getHeight() {
        return height;
    }

    double volue(){
        return 3.14 * this.radius * this.radius * height;
    }
}




public class inhertance_Q {

    public static void main(String[] args) {

//        circle c = new circle(20);
        Cyliender1 c1 = new Cyliender1(20,6);
        System.out.println(c1.area());
        System.out.println( c1.volue());


    }
}
