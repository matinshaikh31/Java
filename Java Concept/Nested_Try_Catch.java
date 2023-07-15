import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 50;
        a[2] = 30;
        a[3] = 40;
        a[4] = 20;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Index no:");
        int indx = sc.nextInt();
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Welcome");
                try {
                    System.out.println("Array At index: " + a[indx]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index out Of Bound");
                    System.out.println("Error Lvl 1");
                }
            } catch (Exception e) {
                System.out.println("Error Lvl 2");

            }
        }

        System.out.println("Thanks");
    }
}
