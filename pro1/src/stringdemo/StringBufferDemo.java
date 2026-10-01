package stringdemo;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		s = sc.next();
		StringBuffer sb  = new StringBuffer(s);
		System.out.println(sb.hashCode());
		sb.append(" Java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}

}
