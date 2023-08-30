//making pyramid with numbers


//  1234
//  123
//  12
//  1




public class reverse_no {
    int m=4;
void num(){
   for (int i = 1; i <=m; i++) {

   for (int j = 1; j <=m+1-i; j++) {
        
        System.out.print(j+" ");
    }
    System.out.println("");
   }


}


public static void main(String[] args) {
    

reverse_no foo = new reverse_no();
foo.num();


}






}
