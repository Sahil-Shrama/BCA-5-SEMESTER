public class ex4 {
public static void main(String[] args) {
    Sum foo = new Sum();
    foo.devide();
    foo.display();
    
}


}

class Sum{
    int sum=0;
    int count=0;
    void devide(){
        for (int i = 100; i <=200; i++) {
            if (i%7==0) {
                sum=i+sum;
                count=count+1;
                
                System.out.println("number are "+String.format("%10d", i));
    
                
            }
            
        }
    }
    void display(){
        System.out.println("sum of number are "+sum);
        System.out.println("total numbers are "+count);
    }
    
}
        

    
    
    

