package assignments;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st number");
		Scanner firstNum = new Scanner(System.in);
		int fn = firstNum.nextInt();
		
		System.out.println("Enter 2nd number");
		Scanner secondNum = new Scanner(System.in);
		int sn = secondNum.nextInt();
		
		System.out.println("Enter 3rd number");
		Scanner thirdNum = new Scanner(System.in);
		int tn = thirdNum.nextInt();
		
		if(fn>sn && fn>tn)
			System.out.println(fn+" is largest number");
		else if(sn>fn && sn>tn)
			System.out.println(sn+" is largest number");
		else
			System.out.println(tn+" is largest number");
		

	}

}
