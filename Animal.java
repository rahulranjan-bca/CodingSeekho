public class Animal{
	
	int age=20;
	String color="Black";
	
	void eat(){
		System.out.println("I am Aniaml");
	}
	
	
	public static void main(String args[]){
		Animal a1 = new Animal();
		
		System.out.println("Age:"+a1.age);
		System.out.println("Color:"+a1.color);
		System.out.println("Method:");
		a1.eat();
		System.out.println(a1);
		
		Animal a2 = new Animal();
		
		a2.age=22;
		a2.color="Red";
		
		System.out.println("Age:"+a2.age);
		System.out.println("Color:"+a2.color);
		System.out.println("Method:");
		a2.eat();
		System.out.println(a2);
	}
	
}