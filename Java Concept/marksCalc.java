import java.util.Scanner;

public class marksCalc {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths Marks:");
        int maths = sc.nextInt();
        System.out.println("Enter Eng Marks:");
        int Eng = sc.nextInt();
        System.out.println("Enter Guj Marks:");
        int Guj = sc.nextInt();
        System.out.println("Enter SS Marks:");
        int SS = sc.nextInt();
        System.out.println("Enter Hindi Marks:");
        int Hindi = sc.nextInt();

        var Sum = (maths + Eng + Guj + SS + Hindi) * 100;
        var per = Sum/500;


        if(per<33) {
            System.out.println("Fail");
        }else{
                System.out.println("PASS");
            }
        }
    }

