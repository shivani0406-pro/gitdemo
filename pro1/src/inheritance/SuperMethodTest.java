package inheritance;

class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
	
	void display() {
		sound();
		super.sound(); //super to call parent class method
	}
}

public class SuperMethodTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
		//super.sound();  Cannot use super in a static context

		//at inheritance.SuperMethodTest.main(SuperMethodTest.java:24)

	}

}
