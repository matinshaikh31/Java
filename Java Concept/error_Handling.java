import java.util.Scanner;

public class error_Handling {
    public static void main(String[] args) {
        int []a= new int[5];
        a[0]=10;
        a[1]=50;
        a[2]=30;
        a[3]=40;
        a[4]=20;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Array index:");
        int Indx = sc.nextInt();

        System.out.println("Enter A Number ou Wnat To Divide:");
        int num = sc.nextInt();


     //   System.out.println("Your Selected Array Is :" + a[Indx]);
       // System.out.println("the answer of array-Indx/number  Is :" + a[Indx]/num);


        try{
            System.out.println("Your Selected Array Is :" + a[Indx]);
            System.out.println("the answer of array-Indx/number  Is :" + a[Indx]/num);
        }
        catch (ArithmeticException e ){
            System.out.println("ArithmeticException Occur!");
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException Occur");
        }
        catch (Exception e ){
            System.out.println("Some Other  Error Occur");
        }


    }
}
