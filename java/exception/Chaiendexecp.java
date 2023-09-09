// with the help of chained exception we can also specify the cause of the
// exceprion to occur
// initCause is used for the another exception by which error occur 
// getcause is used for print thatmexeption 

public class Chaiendexecp {
    static void Fuct(){
        System.out.println("returning channned");
      NullPointerException e = new NullPointerException("pointer in null");
      e.initCause(new ArithmeticException("cause for it" ));
      throw e;
    }
    public static void main(String[] args) {
        try {
         Fuct();
        } catch (NullPointerException e) {
          System.out.println("caught "+e);
          System.out.println("initcause "+e.getCause());
        }
    }
}
