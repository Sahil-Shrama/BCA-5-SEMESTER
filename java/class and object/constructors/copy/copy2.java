

public class copy2 {
    copy2( A foo){
       int x=foo.x;
        System.out.println("the no is ");
    }
public static void main(String[] args) {
    A foo = new A();
    foo.x=12;
    foo.display();
    copy2 foot = new copy2(foo);
    
    
    
    
}    
}


class A{
    int x;
    void display(){
        System.out.println("printing "+x);

    }
}
