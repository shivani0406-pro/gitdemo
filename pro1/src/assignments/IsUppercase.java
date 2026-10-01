package assignments;

import java.util.Scanner;

public class IsUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any character");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c>='A'&& c<='Z')
			System.out.println(c+" is Uppercase");
		else
			System.out.println(c+" is lowercase");

	}

}
