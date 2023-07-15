interface Camera2{
    public void takeSnap();
    void recordViedo();
    default  void recordIn4k(){
        System.out.println("Recording in 4K");
    }
}
interface Wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callinng(int phonenumber){
        System.out.println("calling The Phone"+ phonenumber);
    }
    void pickup(){
        System.out.println("pickup The Phone");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements Wifi2,Camera2{
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

public class Polyimorphism {
    public static void main(String[] args) {
        Camera2 c =  new MySmartPhone2();
       // c.calling(); -> Not Allowed

        c.recordIn4k();

        MySmartPhone2 Ms=new MySmartPhone2();
        Ms.getNetwork();
        Ms.takeSnap();

    }
}
