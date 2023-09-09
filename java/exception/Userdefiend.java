 class Userdefiend extends Throwable {
   int b ;

 Userdefiend(int a ){
    System.out.println("this is userdefiend");
    b=a;
   }   
   


   public String toString(){
   return "Userdefiend["+b+"]";
   }
}

class Demo{
   static void compute(int a ) throws Userdefiend{
      System.out.println("called ("+a+")");
      if(a>18)
      throw new Userdefiend(a);
      System.out.println("normal exit");

   }
   public static void main(String[] args) {
      try{
         compute(1);
         compute(20);
      }
      catch(Userdefiend a){
         System.out.println("caught "+a.toString());
         // by default jb bhi hum object ka naam likhta ha tb voh
         // print karna ke liya tb voh tostring fuction ko call krta ha  
         // or hum usa ovverride kr skta ha 

      }
   }
}


