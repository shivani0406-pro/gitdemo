package assignments;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
				c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
			System.out.println(c+" is a Vowel");
		else
			System.out.println(c+" is a Consonant");

	}

}
