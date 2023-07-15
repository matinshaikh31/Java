class Phone{
    public void greet(){
        System.out.println("Good morning");
    }

    public void on(){
        System.out.println("turning On Phone");
    }

}
class smartPhone extends Phone{
    public void swagat(){
        System.out.println("aya");
    }

    public void on(){
        System.out.println("turning on smart phone");
    }


}


public class dyanmic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new smartPhone();
        obj.greet();
        obj.on();



    }

}
