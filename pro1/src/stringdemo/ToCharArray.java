package stringdemo;

import java.util.Scanner;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		s = sc.next();
		char c[] = s.toCharArray();
		System.out.println(c);
		String rev = "";
		int l = s.length();
		int i;
		for(i=l-1;i>=0;i--) {
			rev = rev+c[i];
		}
		System.out.println(rev);
	}

}
