package Collection;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push("Rahul");
        st.push("Kumar");

        System.out.println("Stack: "+st);

        st.pop();
        System.out.println("After Pop: "+st);

        System.out.println("Peek Element: "+st.peek());

        System.out.println("Search: "+st.search("Rahul"));
        System.out.println("Empty: "+st.empty());
    }
}
