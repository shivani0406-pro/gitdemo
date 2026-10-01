package Exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		try {
			int a =10/0;
			System.out.println("Division: "+a);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error: divisible by 0");
		}
		System.out.println("end");

	}

}
