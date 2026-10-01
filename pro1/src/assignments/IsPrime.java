package assignments;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime = true;
		
		if(num==1) {
			isPrime = false;
		}
		
		for(int i =2; i<num; i++) {
			if(num % i == 0)
				isPrime = false;
		}
		
		if(isPrime)
			System.out.println(num+" is a Prime number");
		else
			System.out.println(num+" is not a Prime number");

	}

}
