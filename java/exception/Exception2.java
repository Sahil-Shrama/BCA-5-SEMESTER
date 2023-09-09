// hierarchy
 
//                     throwable
//          exception             error
//    runtime exception   


class Exception2 {
    public static void main(String[] args) {
        
    
    try {
    
        System.out.println(args[0]);
        float x = Float.parseFloat(args[0]);
        int y= 300/Integer.parseInt(args[0]);
        System.out.println(y);

    }

     catch (ArrayIndexOutOfBoundsException e) {

        System.out.println("index out of bound "+e.getLocalizedMessage());
        System.out.println("index out of bound "+e.getMessage());
        System.out.println("index out of bound "+e.toString());
        
    }
    catch(ArithmeticException e){
        System.out.println("Airthametic");
    }
    catch(RuntimeException e){
        System.out.println("up");
    }
}
}
 class InnerException2 {
public static void main(String[] args) {
 try {
    
    
        System.out.println(args[0]);
        float x = Float.parseFloat(args[0]);
        int y= 300/Integer.parseInt(args[0]);
        System.out.println(y);

    
 } catch (ArrayIndexOutOfBoundsException  | ArithmeticException e ) {
    System.out.println("yoyo evin");
 }
    
}
    
}