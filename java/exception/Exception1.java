// https://www.geeksforgeeks.org/built-exceptions-java-examples/






public class Exception1{
    public static void main(String[] args) {
        // airthamatic exception like devide by zero etc 
        System.out.println("enter number you want to devide " );
        int x = 0;
        System.out.println(x);
        System.out.println("trying catch ");
        try {
            System.out.println("enterd catch");
            int z = 200/x;
            System.out.println(z);
        }
         catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("please enter a positive character and grater then zero");

        }
    }
}



class Arrayindex{
    public static void main(String[] args) {
       
        System.out.println("exception array index out of bound");
        
        try {
            System.out.println(args[0]);  
            
        } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("please enter the value of array");
        }
        

    }
}

class Numberformat{
    // This exception is raised when a method could not convert a string into a numeric format.
    public static void main(String[] args) {
        System.out.println("This exception is raised when a method could not convert a string into a numeric format.");
      String t ="78w";
      try{
          int z = Integer.parseInt(t);
          System.out.println(z);

      }
      catch(NumberFormatException e){
        System.out.println("enter no only ");

      }

    }
}



class Nullpointer{
    // This exception is raised when referring to the members of a null object. Null represents nothing 
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s);
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("please refer to the something to the object ");

        }
    }
}

// NoSuchMethodException : t is thrown when accessing a method which is not found.

// ClassNotFoundException : This Exception is raised when we try to access a class whose definition is not found. 