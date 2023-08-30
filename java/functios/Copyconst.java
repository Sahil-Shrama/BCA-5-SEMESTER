
class D{
int a=12;
int b=13;
void display()
{
    System.out.println("this is first output");
}


}
class B{

    B(D obj){
        int x=obj.a;
        System.out.println(x);
        obj.display();

    }

}

public class Copyconst {
    public static void main(String[] args) {
        D foo = new D();
        B foo1 = new B(foo);
        
        
    }
}
