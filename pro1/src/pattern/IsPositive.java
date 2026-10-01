package pattern;

import java.util.Scanner;

public class IsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println(num+" is negative");
		}
		else {
			System.out.println(num+" is positive");
		}

	}

}
