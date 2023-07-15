class c1{
    int x ;

    public int getX() {

        return x;
    }

    c1(int x){
        this.x =x;
        System.out.println("hi" + x);
    }


}
class c2 extends c1{
    c2(int x){
        super(x);
        System.out.println("hi "+ x);
    }


}




public class this_super {

    public static void main(String[] args) {

        c1 a = new c1(1);
        System.out.println();

        c2 b = new c2(2);
        System.out.println();


    }
}
