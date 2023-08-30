public class Classs {
    public static void main(String[] args) {
        A foo = new A();
        B foo2 = new B();
        
        foo.yt();
        A.mt();
        foo2.yt();
        // foo.mt();
   }
}

class A{
    static void mt(){
        System.out.println("its static");
    }
    public void yt(){
        System.out.println("yoyo its exit");
        System.exit(0);
    
    }
}
class B{
    static void mt(){
        System.out.println("its static this is b");
    }
    public void yt(){
        System.out.println("yoyo this is b");
    }
}
