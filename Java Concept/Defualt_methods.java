interface Camera{
    public void takeSnap();
    void recordViedo();
    default  void recordIn4k(){
        System.out.println("RWcorfing in $K");
    }
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callinng(int phonenumber){
        System.out.println("calling The Phone"+ phonenumber);
    }
    void pickup(){
        System.out.println("pickup The Phone");
    }

}

class MySmartPhone extends MyCellPhone implements Wifi,Camera{
    @Override
    public void takeSnap() {
        System.out.println("Take Snap");
    }

    @Override
    public void recordViedo() {
        System.out.println("recording");
    }

    @Override
    public String[] getNetwork() {
         String[] networklist ={"matin","jay","arhan"};
         return  networklist;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting" + network );
    }
}





public class Defualt_methods {

    public static void main(String[] args) {

        MySmartPhone sp = new MySmartPhone();
        sp.recordIn4k();
        String[] ar = sp.getNetwork();
        for (String items:ar
             ) {
            System.out.println(items);
            
        }


    }
}
