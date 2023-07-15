class MyEmployee{

     private int id;
    private String Name;


public void setName(String n){
    Name = n;

}public String getName() {
        return Name;
    }
    public void setId(int i ){
id = i;
    }

    public int getId() {
        return id;
    }
}



public class Acces_modifier {
    public static void main(String[] args) {

        MyEmployee matin = new MyEmployee();
        matin.setId(45);
        matin.setName("MS");
       int ID = matin.getId();
       String N = matin.getName();
        System.out.println(ID);
        System.out.println(N);

//        matin.id = 4;
//        matin.Name =  "Ms";

    }
}
