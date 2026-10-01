package assignments;

import java.util.Scanner;

public class DivisibleByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 5 == 0)
			System.out.println(num+" is divisible by 5");
		else
			System.out.println(num+" is not divisible by 5");
		

	}

}
