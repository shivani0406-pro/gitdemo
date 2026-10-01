package pattern;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("Enter second number: ");
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		
		if(num>num2) {
			System.out.println(num+" is largest");
		}
		else {
			System.out.println(num2+" is largest");
		}

	}

}
