class A{
    final int x= 12;
    final int y;
    final void inter(){
        System.out.println("yoyo");
    }
    void show(){
        inter();
    }

}

final class B{
    void display(){
        System.out.println("yors welcome");
    }
}

class C{
    final int x;
    C(){
      x=5;
    }
}


public class Final {
    public static void main(String[] args) {
        A foo = new A();
        foo.inter();
        foo.show();
        
        
        
    }
}
