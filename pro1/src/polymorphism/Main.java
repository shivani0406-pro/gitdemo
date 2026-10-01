package polymorphism;

public class Main {
	
	
	/* Can we overload main method 
	 * 
	 * Yes
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(10); 
		
		
		/*
		 * If we remove static keyword from method
		 * 
		 * Cannot make a static reference to the non-static method main(int) from the
		 * type Main
		 * 
		 * static method can call only a static method
		 * 
		 */


	}
	
	public static void main(int num) {
		System.out.println(10);
	}

}
