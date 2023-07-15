
//Q1//
abstract class pen{
    abstract void write();
    abstract void Refill();
}
class FountainPen extends  pen{
    void write(){
        System.out.println("Write");
    }
    @Override
    void Refill() {
        System.out.println("Refiil");
    }
    void chaneNib(){
        System.out.println("Change nib");
    }
}


//Q2//

class moneky{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends moneky implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }


}


//Main//

public class Interface_Abstract_Q {
    public static void main(String[] args) {

        FountainPen Fp = new FountainPen();
        Fp.Refill();

        Human H = new Human();
        H.bite();

        moneky M = new Human();


    }
}
