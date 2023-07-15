public class Array {


    public static void main(String[] args) {



        int [] marks = {20,40,430,4};
        for(int i = 0 ; i<marks.length ; i++){
            System.out.println(marks[i]);
        }
        System.out.println(">>>>>>>");
        for(int i=marks.length -1 ; i>=0 ; i--){
            System.out.println(marks[i]);
        }
        System.out.println(">>>>>>>");
        for(int elemnts : marks){
            System.out.println(elemnts);
        }


    }







}
