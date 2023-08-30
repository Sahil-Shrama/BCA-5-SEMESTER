//creating half pyramid
//*
// **
// ***
// ****


public class half_py {
  int m=4,n=4;
  
  void halfpy(){
    for (int i = 1; i <= m; i++) {

        for (int j = 1; j <=i; j++) {

            System.out.print("*");
            
        }
        System.out.println("");
    }
  }



  public static void main(String[] args) {
      
    half_py foo = new half_py();
     
    foo.halfpy();


  }
}



