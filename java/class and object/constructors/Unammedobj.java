// we only use unamed objects only one time when we just have to call object only onces


public class Unammedobj {
public static void main(String[] args) {
    new A().display();
    new A().display();
    
}    
}

class A{
    void display(){
        System.out.println("diplaying message");
    }
}
