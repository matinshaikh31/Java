

class Employee{

    int ID;
    String Name;
    int salary;



    public int getSalary(){
        return salary;
    }

    public void printDetails (){
        System.out.println("Eployee Id is " + ID);
        System.out.println("Employee Name Is " + Name);

    }
}



public class Custom_class {

    public static void main(String[] args) {
        System.out.println("This Is My Custom Class");

        Employee E1 = new Employee(); //Creating A new object 1 Employee
        Employee E2 =new Employee();// Creating a new Object For 2 Employee

        //Setting Attributes
        E1.ID = 12;
        E1.Name= "Jay";
        int salary = E1.salary = 30;

        E2.ID = 13;
        E2.Name= "Matin";
        salary = E2.salary = 40;



        //printing the attribtes
        E1.printDetails();
        E2.printDetails();
        System.out.println(salary);

    }
}
