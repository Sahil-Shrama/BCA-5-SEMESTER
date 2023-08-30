//inverse pyramid

// ****
// ***
// **
// *

public class revere_py {


    int m=4,n=5;

    void reversepy(){
        for (int i = m; i >= 0 ; i--) {

            for (int j =1 ; j <= i; j++) {
                System.out.print("*");

                
            }
            System.out.println("");
            
        }
    }

    public static void main(String[] args) {
        revere_py foo = new revere_py();
        foo.reversepy();
        
    }
    
}