 interface InnerInterfac1 {
void display();
void animal();
void name();
}

 class InnerInterfac1_1 implements InnerInterfac1 {

     public void display(){
        System.out.println("Class b ");
    }
    public void animal(){
        System.out.println("tiger");
    }
    public void name(){
        System.out.println("evin");
    }
}



public class Interfac1{
    public static void main(String[] args) {
      InnerInterfac1_1 foo = new InnerInterfac1_1();
         foo.animal(); 
         foo.display();
           
    }
}   