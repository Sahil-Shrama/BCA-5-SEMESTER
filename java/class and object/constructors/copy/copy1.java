// in this we are referncing a object to another pbjexct
// this is also called as reference object
public class copy1 {
    public static void main(String[] args) {
        A foo = new A();
        foo.x=12;
        foo.display();
        A foo1 = foo;
        
        foo1.display();
        copy1 foot = new copy1();
        // foot.display();
    
        
        

        
    }
}
class A{

    
    int x;
     public void display(){
        System.out.println("yuiopokjnb "+x);
    }
}
