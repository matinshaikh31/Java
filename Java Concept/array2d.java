public class array2d {

    public static void main(String[] args) {
        int [][] a = new int[2][3];

        a[0][0]= 101;
        a[0][1] = 102;
        a[0][2]= 103;

        a[1][0]= 101;
        a[1][1] = 102;
        a[1][2]= 103;



        for(int i = 0 ; i<a.length ; i++){
            for(int j=0 ;j<a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");

            }
            

        }
    }
}
