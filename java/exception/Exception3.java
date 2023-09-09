 class Exception3 {
    // using finally 
    public static void main(String[] args) {
        try {
         
            System.out.println(args[0]);


        } catch (Exception e) {
            System.out.println("dont want to ");
        }
        finally{
            System.out.println("nothing to print ");
        }

    }
    
 }

 class Throwex{
    public static void main(String[] args) {
        System.out.println("checking throw exception");
      throw new ArithmeticException("array out of bound");
    }
 }

class Throw2{
    public static void throwDisplay(){
        System.out.println("throwing and catching display");
        try{
        throw new NullPointerException("its emply");
        }
        catch(NullPointerException e){
            System.out.println("Its a null pointer exception");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
        throwDisplay();
        }
        catch(NullPointerException e){
          System.out.println("Inside main");
          System.out.println("Inside main"+e);
        }
    }
}

