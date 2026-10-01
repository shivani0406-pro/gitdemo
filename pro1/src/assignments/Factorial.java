package assignments;

import java.util.Scanner;

public class Factorial {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1;
		/*
		 * for(int i=num;i>=1;i--) { fact = fact * i; }
		 */
		
		int i=num;
		while(i>=1) {
			fact = fact *i;
			i--;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
