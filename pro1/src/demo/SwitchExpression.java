package demo;

public class SwitchExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2;
		switch(x) {
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
			
			default:
				System.out.println("Invalid");
				
		}
		// Not allowed in switch case
		/*
		 * float
		 * double
		 * boolean
		 * long
		 */

	}

}
