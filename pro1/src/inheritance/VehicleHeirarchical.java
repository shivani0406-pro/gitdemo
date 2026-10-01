package inheritance;

class Vehicle{  // if we add final modifier to vehicle(Parent class) then it cannot be subclass(extends).
	void start() {
		System.out.println("Vehicle starts");
	} //if we add final to method, it cannot be override.
}

class Car extends Vehicle{
	void start() {
		System.out.println("Car starts");
	}
}

class Bike extends Vehicle{
	void start() {
		System.out.println("Bike starts");
	}
}

public class VehicleHeirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.start();
		
		Bike bike = new Bike();
		bike.start();

	}

}
