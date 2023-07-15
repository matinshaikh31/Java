
/// Q1 ////

class Employee1{
    int Salary;
    String Namme;

    public int getSalary(){
        return Salary;
    }

    public String getNamme(){
        return Namme;
    }

    public void setNamme(String n){
        Namme = n;
    }
}

// Q2///


class CellPhone {


    public void call() {
        System.out.println("Calling...");
    }

    public void ring() {
        System.out.println("Ringing...");
    }

    public void callFried() {
        System.out.println("Calling to a Friend...");
    }

}



//// Q3///
    class Square{
        int side;

        public int area(){
            return side*side;
        }
        public int parimeter(){
            return 4*side;
        }
    }


    //// Q4 ////


class Rectangle{
    int L;
    int W;

    public int area(){
        return W*L;
    }
    public int parimeter(){
        return 2 * (L+W) ;
    }
}











public class CustomClass_Q1 {

    public static void main(String[] args) {


        /////// Q1 //////

        Employee1 Matin = new Employee1();

        Matin.setNamme("CodeWithMatin");
        System.out.println(Matin.getNamme());
        System.out.println(Matin.getSalary());


        /////Q2////


        CellPhone cellPhone = new CellPhone();


        cellPhone.call();
        cellPhone.ring();
        cellPhone.callFried();


        /////Q3////

        Square square = new Square();

        square.side = 4;

        System.out.println(square.area());
        System.out.println( square.parimeter());

        /////Q4////


        Rectangle rec = new Rectangle();

        rec.L= 4;
        rec.W = 6;

        System.out.println(rec.area());
        System.out.println(rec.parimeter());







    }
}
