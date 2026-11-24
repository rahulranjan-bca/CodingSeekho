class Private{
   private int a=190;
   void m1(){
    System.out.print(a);
   }
}
public class Number {
    public static void main(String[] args) {
       Private obj = new Private();
       obj.m1();
    }
}


