

class a{
    public int m1 (){
        return 2;
    }
    public void m2(){
        System.out.println("hi");
    }
}
class b extends a{
    @Override
    public void m2(){
        System.out.println("hello");
    }

}


public class method_overriding {
    public static void main(String[] args) {
        a m = new a();
        m.m2();
        b n = new b();
        n.m2();



    }
}
