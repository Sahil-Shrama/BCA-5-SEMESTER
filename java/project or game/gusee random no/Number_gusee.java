
import java.lang.Math;
import java.util.Scanner;
public class Number_gusee{
    
public static void gussesing_no_game(){

Scanner foo = new Scanner(System.in);

int number = 1 + (int)(Math.random()*100);
int k=5;
// no of tril k
int i,guess;
System.out.println("A number will be "+
"chosen from 1 to 100"+
"chose the correct no to win"+
"withn 5 trails");
for ( i = 0; i < k; i++) {
    System.out.println("enter the gussed number");
    guess = foo.nextInt();
    if (guess == number) {

        System.out.println("congratulation you printed the correct number");
        break;
        
    }

    else if(number>guess && i!=k-1){
        System.out.println("the number is "+
        "grater than "+guess);
    }

    else if(number<guess){
        System.out.println("the number is "+
        "less than "+guess);
    }
}
if (i==k) {
    System.out.println("you have taken "+
    "your all trails");
    System.out.println("the number was "+number);
    
}


}

public static void main(String[] args) {
gussesing_no_game();    
}
}
