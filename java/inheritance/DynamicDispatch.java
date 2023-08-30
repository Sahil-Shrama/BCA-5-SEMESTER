class A{
    void display(){
        System.out.println("class a");
    }
}

class B extends A{
void display(){
    System.out.println("class b");
}
}
class C extends A{
    void display(){
        System.out.println("class C");
    }
}

public class DynamicDispatch{
    public static void main(String[] args) {
        A foo = new A();
        B foo1 = new B();
        C foo2 = new C();
        
        A obj;
        obj = foo;
        obj.display();
        obj= foo1;
        obj.display();
        obj = foo2;
        foo2.display();
        
    }
}