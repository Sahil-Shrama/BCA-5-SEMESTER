///swaping the numbers
public class SWAP extends b {
  public static void main(String[] args) {

    b obj = new b();

    
    System.out.println("values before swaping "+obj.a+"  "+obj.b);

    b.swap();
    System.out.println(obj.a+"  "+obj.b+"aftre swaping is done");

  }    
}

class b{
    int a=10,b=20;
    
        
    
      void swap(){
        int t;
        t=a;
        a=b;
        b=t;
     }
}
