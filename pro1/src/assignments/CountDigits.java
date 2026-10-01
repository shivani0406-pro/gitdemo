package assignments;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if(num==0)
			count = 1;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		
		System.out.println("Digits: "+count);

	}

}
