public class METHODS {

    static int sum(int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int x=10;
        int y=11;



        METHODS obj = new METHODS();
        int z = obj.sum(x,y);
        System.out.println(z);


    }
}


