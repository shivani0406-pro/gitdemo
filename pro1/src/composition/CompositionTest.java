package composition;


/*Composition is strong relationship
 * 
 * Composition in Java is a design technique used to implement a strong "HAS-A" 
 * (or "part-of") relationship between classes.
 *  It occurs when one class contains an instance of another class as a member variable.
 * 
 * */

class Engine{
	void start() {
		System.out.println("Engine starts");
	}
}

class Car{
	private Engine engine; //Composition
	
	Car(){
		engine = new Engine(); //Created inside Car
	}
	void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}

public class CompositionTest {
	public static void main(String args[]) {
		Car c = new Car();
		c.drive();
	}
}
