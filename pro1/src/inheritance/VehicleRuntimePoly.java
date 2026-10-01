package inheritance;

public class VehicleRuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v = new Car();
		v.start();
		
		v = new Bike();
		v.start();
		
		Car c1 = new Car();
		v = c1;
		v.start();
		
		Bike b1 = new Bike();
		v = b1;
		v.start();
		

	}

}
