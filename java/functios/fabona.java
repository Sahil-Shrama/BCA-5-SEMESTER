import java.util.Scanner;

public class fabona {

    void series(){
        int n=5;
        int sum;
        int a =1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        sum=1;
        for (int i = 2; sum <n; i++) {
            sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;

            
            
        }
    }
    
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        System.out.println("enter the number for fab");
        int tt=foo.nextInt();
        fabona f = new fabona();
        f.series();
        
        
    }
}
