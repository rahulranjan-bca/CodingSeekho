package Collection;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        // System.out.println("Default Capacity: "+v.capacity());

        v.addElement(10);
        v.addElement(20);
        v.addElement("Java");
        v.addElement("Python");

        System.out.println("Vector: "+ v);

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        v.removeElement(10);
        System.out.println("After Remove: "+ v);


        // Vector v1= new Vector();
        // for(int i=0;i<11;i++){
        //     v1.add(i);
        // }
        // System.out.println("Capacity: "+v1.capacity());
    }
}
