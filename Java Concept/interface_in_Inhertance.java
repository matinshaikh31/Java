interface SampleClass{
    void meth1();
    void meth2();
}
interface childSample extends SampleClass{
    void meth3();
    void meth4();
}

class MysampleClass implements  childSample{
    public void meth4() {
        System.out.println("4");
    }
    @Override
    public void meth3() {
        System.out.println("3");
    }

    @Override
    public void meth1() {
        System.out.println("1");
    }

    @Override
    public void meth2() {
        System.out.println("2");

    }
}




public class interface_in_Inhertance {
    public static void main(String[] args) {
    MysampleClass MSC = new MysampleClass();
    MSC.meth1();
    }
}
