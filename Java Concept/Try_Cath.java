public class Try_Cath {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;


      /*       <----Without try Catch----->
        int c = a/b;
        System.out.println("The reuslt of a/b is " + c ); */



//<-------------With Try Block----------->


    try{
        int c = a/b;
        System.out.println("The reuslt of a/b is " + c );

    }
    catch (Exception e){
        System.out.println("Failed to divide reason:");
        System.out.println(e);
    }

        System.out.println("End Of program");
    }

}
