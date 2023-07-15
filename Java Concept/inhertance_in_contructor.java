class base1{


    public base1() {
        System.out.println("i am base");
    }
    base1(int x){
        System.out.println("i am  OL base " + x);
    }
}

class derived1 extends base1{
    derived1(){
        //super(0);
        System.out.println("i am derived");
    }
    derived1(int x ,int y){
        super(x);
        System.out.println("i am  OL deprived " + y);
    }
}

class  grandchild extends derived1{

    grandchild(){
        System.out.println("i am Grandchild");
    }

    grandchild(int x,int y,int z){
        super(x,y);

        System.out.println("i am OL GrandChild " + z);
    }

}
public class inhertance_in_contructor {
    public static void main(String[] args) {
        //base1 b = new base1();

        //derived1 d = new derived1(1,2);

        grandchild g = new grandchild(1,2,3);

    }
}
