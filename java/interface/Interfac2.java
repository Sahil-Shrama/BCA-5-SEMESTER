 interface InnerInterfac1 {

    final int b=12;
    static void num(){
        System.out.println("yoyo");
    }
void display();
void animal();
void name();
}

 class InnerInterfac1_1 implements InnerInterfac1 {
    int t=b;

     public void display(){
        System.out.println("Class b "+t);
    }
    public void animal(){
        System.out.println("tiger");
    }
    public void name(){
        System.out.println("evin");
    }
}



public class Interfac2 {
  
    public static void main(String[] args) {
     
        InnerInterfac1_1 foo = new InnerInterfac1_1();
        
       InnerInterfac1.num(); 

    }

}
