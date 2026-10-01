package assignments;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18)
			System.out.println("You are eligible to vote");
		else
			System.out.println("You are not eligible to vote");

	}

}
