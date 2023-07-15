public class RECURSION {


    static int factorial(int  n ){

        if (n==0 || n==1){

            return 1 ;
        }
        else{
            return n * factorial(n-1);
        }


    }




    static  int factorila(int n){

       int  temp =1;
        if (n==0||n==1){
            return 1;
        }
        else {
            for(int i=1 ;i<=n ; i++){
                temp = temp * i;
            }
            return temp;
        }
    }


    public static void main(String[] args) {
        System.out.println(factorila(5));
        System.out.println(factorial(5));

    }
}
