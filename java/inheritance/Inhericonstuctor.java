class A{
    A(int x,int y){
        x=10;
        y=12;
        System.out.println("first one "+x+y);
    }
    A(int t){
        System.out.println("for t");
    }
}


public class Inhericonstuctor {
public static void main(String[] args) {
    A foo = new A(5,6);
    // foo.A(4);
    
    
}    
}
