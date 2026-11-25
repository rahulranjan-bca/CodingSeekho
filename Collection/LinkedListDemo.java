package Collection;
import java.util.LinkedList;
public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add("Rahul");

        System.out.println(ll);

        ll.addFirst("FirstAdd");
        System.out.println("First Add: "+ll);

        ll.addLast("lastAdd");
        System.out.println("Last Add: "+ll);

        System.out.println("First Get: "+ll.getFirst());
        System.out.println("Last Get:"+ ll.getLast());

        ll.removeFirst();
        System.out.println("Remove First: "+ll);

        ll.removeLast();
        System.out.println("Remove Last: "+ll);
    }
}