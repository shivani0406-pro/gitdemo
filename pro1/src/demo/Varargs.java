package demo;

public class Varargs {
	
	static void display(int... numbers) {
		for(int n:numbers) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display(1);
		display(10,20,30);
		display(5,10,15,20,25);

	}

}
