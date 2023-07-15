class base{
    int x;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}

class derived extends base{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}





public class inheratnce {
    public static void main(String[] args) {


        base b = new base();
        b.setX(3);
        System.out.println(b.getX());
        derived d = new derived();
        d.setX(39);
        System.out.println(d.getX());

    }
}
