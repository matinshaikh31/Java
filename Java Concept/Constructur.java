

    class MyEmployee1{

        private int id;
        private String Name;


        public MyEmployee1(String name , int ID){
            this.id= ID;
            this.Name = name;
        }



//        public MyEmployee1(){
//            id= 35;
//            Name = "ms";
//        }


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



    public class Constructur {
        public static void main(String[] args) {

            MyEmployee1 matin = new MyEmployee1("MatinShaikh", 22000519);
            System.out.println(matin.getName());
            System.out.println(matin.getId());




        }
    }


