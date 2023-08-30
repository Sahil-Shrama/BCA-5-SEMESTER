class A{
    public void display(){
        System.out.println("yoyoy whats up");
    }
}
class B extends A{
     public void display(){
        System.out.println("this is sub class");
    }
    void show(){
        super.display();
    }
}


public class Overridding {
    public static void main(String[] args) {
        A foo = new A();
        foo.display();
        B foo2 = new B();
        foo2.display();
        foo2.show();
        
        
    }
    
}
