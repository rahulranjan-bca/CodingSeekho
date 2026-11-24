package Protected;
class Student{
    int rollno;
    String name;
}

public class MainApp1 {
    public static void main(String [] arg){
        Student s1=new Student();
        s1.rollno=10;
        s1.name="rahul";

        System.out.println(s1.rollno+" "+s1.name);
    }
    
}
