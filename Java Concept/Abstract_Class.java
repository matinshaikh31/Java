abstract class parent1{

    public parent1(){

    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();

}
class child1 extends parent1{
    @Override
    public void greet(){
        System.out.println("Tu kaisa hoo app log");
    }

}
abstract class chlid2 extends parent1{
    public void m1(){
        System.out.println("m1");
    }

}


public class Abstract_Class {
    public static void main(String[] args) {
//        parent1 p1 = new parent1(); --> error obj of abstract class ot possible
        child1 c1 = new child1();

    }
}
