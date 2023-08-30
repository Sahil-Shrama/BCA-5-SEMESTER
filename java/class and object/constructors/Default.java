public class Default {
 
 int x;
 Default(){
    x=12;
 }
 void display(){
    System.out.println("number is "+x);
 };
 
    public static void main(String[] args) {
    Default foo = new Default();
    foo.display();
    
    
 }    
}
