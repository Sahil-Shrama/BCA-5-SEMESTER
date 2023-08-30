interface A1{
    void temp();
}
interface B1{
    void temp1();
}
interface C1 extends A1,B1{
    void temp2();
}

interface D1 {
    void temp3();
}
class A implements C1,D1{
    public void temp(){
      System.out.println("yoyoy1");        
    }
    public void temp1(){
      System.out.println("yoyoy2");        
    }
    public void temp2(){
      System.out.println("yoyoy3");        
    }
    public void temp3(){
      System.out.println("yoyoy3");        
    }
    
 
}


public class Interfac3 {

    public static void main(String[] args) {
        A foo = new A();
        foo.temp();
        foo.temp1();
        foo.temp2();
        foo.temp3();
        
        
    }
}