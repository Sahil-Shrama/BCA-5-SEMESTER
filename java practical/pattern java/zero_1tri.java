//1 0 pyramid
// 1
// 10
// 101
// 0101


public class zero_1tri {
    int m=5;
    void zero(){
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                    
                } else {
                    System.out.print("0 ");
                    
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        zero_1tri foo = new zero_1tri();
        foo.zero();
    }
}
