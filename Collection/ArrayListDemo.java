package Collection;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add("Deepak");
        System.out.println(al);

        System.out.println(al.get(1));
        al.set(0,1);
        System.out.println(al);
        System.out.println(al.lastIndexOf("Deepak"));


        /* Convert ArrayList to array */

        // Object[] obj = al.toArray();
        // for(int i=0;i<obj.length;i++){
        //     System.out.println(obj[i]);
        // }

        // ArrayList al2 = new ArrayList();

        // al2.add(30);
        // al2.add("Rahul");

        // al2.addAll(al);
        // System.out.println(al2);

        // System.out.println(al.isEmpty());

        /* Clear Method */
        // System.out.println(al);
        // al.clear();
        // System.out.println(al);

        /* Remove Method */
        // al2.add(al);
        // System.out.println(al2);
        // al2.remove(al);

        /* Contains() Method */
        // System.out.println(al2);
        // System.out.println(al2.contains(al));  
    }
    
}
