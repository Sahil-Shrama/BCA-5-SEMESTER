// online check for inbuilt checked exception

// filenotfound exception 
// classnotfound exection
// sql excetion






public class Throws1 {

//    it will not work because there in no try and catch for the exception

    static void throw1(){
        System.out.println("tryimg throw");
        // throw new IllegalAccessException("dont do illegal");  
        System.out.println("dont comment upper statement for firt case");
//         unreported exception IllegalAccessException; must be caught
// or declared to be thrown
    }


    public static void main(String[] args) {
        throw1();
    }


}











 class Throws3 {

//    it will not work because there in no try and catch for the exception

    static void throw1(){
        System.out.println("tryimg throw");
        throw new ArrayIndexOutOfBoundsException("out of bound");  
        // System.out.println("dont comment upper statement for firt case");
//         unreported exception IllegalAccessException; must be caught
// or declared to be thrown
    }


    public static void main(String[] args) {
        throw1();
    }
}


class Throw2{
    static void throw1() throws IllegalAccessException {
    System.out.println("inside throw");
    throw new IllegalAccessException("its empty");
    }
    public static void main(String[] args) {
     try {
        throw1();
     } catch (IllegalAccessException e) {
        // TODO: handle exception
        System.out.println("null point exception caught");
     }    

    }

}
