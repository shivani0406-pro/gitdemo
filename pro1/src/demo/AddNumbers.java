package demo;

import java.util.Scanner;

public class AddNumbers {
	
	public static int add(int a, int b) {// formal arg
		return a+b;
	}
	
	public static int sub(int a, int b) {// formal arg
		return a-b;
	}
	
	public static int mul(int a, int b) {// formal arg
		return a*b;
	}
	
	public static int div(int a, int b) {// formal arg
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter first number");
		 int num1 = sc.nextInt();
		 
		 System.out.println("Enter second number");
		 int num2 = sc.nextInt();
		 
		 System.out.println("Enter 1 to Add\nEnter 2 to substract\nEnter 3 to multiply"
		 		+ "\nEnter 4 to divide");
		 
		 int operation = sc.nextInt();
		 int result = 0;// Actual arg
		 
		 switch (operation) {
		 	case 1: {
			
			result = add(num1,num2);
			break;
		}
		 	case 2: {
			
			result = sub(num1,num2);
			break;
		}
		 	case 3: {
			
			result = mul(num1,num2);
			break;
		}
		 	case 4: {
			
			result = div(num1,num2);
			break;
		}
		
		 	default:
			System.out.println("Invalid operation");
		}
		 
		 System.out.println("result = "+result);
		 sc.close();

	}

}
