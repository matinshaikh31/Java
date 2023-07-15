public class array_Q1 {
    public static void main(String[] args) {
//        int [] a ={20,40,50,60};
//
//      int  sum= 1;
//        for (int i=0 ; i<a.length ; i++){
//
//                 if(sum == a[i]){
//                     System.out.println("YEs");
//
//                     break;
//
//                 }
//                 else {
//                     System.out.println("no");
//                 }
//                 break;
//        }


        ///////////
        /*
        int [] a ={20,40,50,60};

        int sum = 0;
        int avg = 0;

                for(int i =0 ; i<a.length; i++){
                    sum = sum + a[i];
                    avg = sum/a.length;


                }

        System.out.println(sum);
        System.out.println(avg);

        */




    /*    int[][] a = {   {1,2,3},
                        {4,5,6}
                     };
        int[][] b = {{1,2,3},{2,5,6}};

        int[][] c = {{0,0,0},
                {0,0,0}};

        for (int i=0;i<a.length;i++){
            for(int j =0 ; j<a[i].length;j++){
                
                System.out.print(a[i][j]);

                c[i][j]= a[i][j] + b[i][j];

                System.out.print(" ");

            }
            System.out.println("");



        }
        for (int i=0;i<b.length;i++){
            for(int j =0 ; j<b[i].length;j++){

                System.out.print(b[i][j]);

                System.out.print(" ");
            }
            System.out.println("");


        }

        for (int i=0;i<a.length;i++){
            for(int j =0 ; j<a[i].length;j++){

                System.out.print(c[i][j]);

                System.out.print(" ");
            }
            System.out.println("");


        } */



        int[] a ={1,2,3,4,5};
        int l = a.length;
        int m = Math.floorDiv(l,2);
        int temp ;
        for(int i=0;i<m;i++){
            temp = a[i];
            a[i]= a[l-1-i];
            a[l-1-i]=temp;
        }

        for(int i = 0 ; i <a.length; i++){
            System.out.println(a[i]);
        }
    }
}

