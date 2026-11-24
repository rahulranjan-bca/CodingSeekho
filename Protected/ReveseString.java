package Protected;

public class ReveseString {
   public static void main(String[] args) {
    
    String name="rahul";

    String rev = "";

    for(int i=name.length()-1; i>=0;i--){
        rev = rev + name.charAt(i);
    }

    System.out.print(rev);
   } 
}
