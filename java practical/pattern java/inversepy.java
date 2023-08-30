//180 degree pyramid


//     * 
//    **
//   ***
//  ****
// *****

public class inversepy {
    int m=5;
     
    void py(){
        
for(int i=1;i<= m;i++){
    for (int j = 1; j <= m-i; j++) {

        
        System.out.print(" ");
    }   
        for (int j2 = 1; j2 <= i; j2++) {
            System.out.print("*");
            
        }
    
    System.out.println("");

}
        

    }
    public static void main(String[] args) {
       
       
        inversepy foo = new inversepy();
        foo.py();
        
    }

}