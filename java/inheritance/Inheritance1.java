class A{
    int a=5;
    String str1="yiyo";
    float mtech =2.34f;

}

class B extends A{
    void display(){
        System.out.println("values are "+a+str1+mtech);
    }
}

class C{
//    void display1(){
//         System.out.println("values are "+a+str1+mtech);
//     }
}

public class Inheritance1{
    public static void main(String[] args) {
    A foo = new A();
    System.out.println(foo.a);
    B foo1 = new B();
    foo.a=11`;
    System.out.println(foo.a);
    foo1.a=5;
    System.out.println(foo1.a);
    foo1.display();
    
    
    }
}