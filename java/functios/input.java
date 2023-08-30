import java.util.Scanner;
public class input {
    void facto(int n){
        
        int sum=1;
        for (int i = 1; i <n; i++) {
            sum=sum+sum*i;
            
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        Scanner mt = new Scanner(System.in);
     input foo = new input();
     System.out.println("enter the no you want factorial ");
     int t = mt.nextInt();
     
     foo.facto(t);
        
        
    }
}
