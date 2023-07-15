public class METHOS_Q {

   // Q1 //
    static  void Table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+ " x " + i + " = " + n*i);
        }
    }


    //Q2//

    static void Pattern(int n){
          for(int i=0 ;i<n;i++){
              for(int j =0;j<=i;j++){
                  System.out.print("*");
              }
              System.out.println(" ");

        }
    }


    // Q3//

    static int sum(int n){
        if(n<1){
            return 0;
        }
        else{
            return n +sum(n-1);
        }
    }

    //Q4//

    static void Pattern1(int n){
        for(int i=n ;i>0;i--){
            for(int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }


    //Q5//

    static int FB(int n){
        if(n ==1 || n==2){
            return n-1;
        }
        else{
            return FB(n-1) + FB(n-2);
        }
    }


    //Q6//

    static  void  avg(double ...arr){
        double sum=0;

        for(int i =0; i<=arr.length ;i++){

              sum =  sum +i;


        }
        double avgr = sum/arr.length;
        System.out.println(avgr);
  ;
    }

    public static void main(String[] args) {
        Table(5);
        Pattern(5);
        System.out.println(sum(5));
        Pattern1(5);
        System.out.println(FB(7));
        avg(1,2,3,4,5,6);



    }
}
