package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = {1,2,3};
			System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Index out of range");
		}
		finally {
			System.out.println("Program completed");
		}

	}

}
