public class Birds{
	void fly(){
		System.out.println("I am Flying..");
	}
	public static void main(String args[]){
		Birds b1=new Birds();
		b1.fly();
		Animal a1=new Animal();
		a1.eat();
	}
}
class Animal{
void eat(){
System.out.println("I am Eating ...");
}

}