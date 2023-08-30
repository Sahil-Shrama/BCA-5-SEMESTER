class A{
    A(){
        System.out.println("this is super claas");
    }
   A(int x,int y){
    System.out.println("sum is "+(x+y));
   }
}

class B extends A{
   
    
    B(){
        super(5, 6);
        System.out.println("this is b class");
    }

}

// class C extends B{
//     C(){
//         System.out.println("this is c sub class");
//     }
// }




public class Inheritconstr {
    public static void main(String[] args) {
        A foo = new A();
        B foo1 = new B();
        // C foo2 = new C();
        
        
    }
    
}
