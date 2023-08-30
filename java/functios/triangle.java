public class triangle {

    void tri(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
                
            }
            System.out.println("");
            
        }

    }
    public static void main(String[] args) {
        triangle foo = new triangle();
        foo.tri();
        
    }
    
}
