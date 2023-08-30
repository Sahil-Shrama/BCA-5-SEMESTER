
//reverse a string 


public class one{
    public static void main(String[] args) {

        System.out.println("dog");
        String r= reverse("dog");
        System.out.println(r);
    }

    public static String reverse(String s) {

        char[] letters =new char[s.length()];

        int letterindex = 0;

        for (int i = s.length()-1; i < s.length(); i--) {
            System.out.println(s.charAt(i));
            letterindex++;
            
        }

        String reverse ="";
        for (int i = 0; i <s.length() ; i++) {
            reverse = reverse + letters[i];
            
        }
        return s;
        
    }
}