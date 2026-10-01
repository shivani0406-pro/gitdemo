package assignments;

import java.util.Scanner;

public class YoungestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter First Person's age");
		Scanner firstAge = new Scanner(System.in);
		int fage = firstAge.nextInt();
		
		System.out.println("Enter Second Person's age");
		Scanner secondAge = new Scanner(System.in);
		int sage = secondAge.nextInt();
		
		System.out.println("Enter Third Person's age");
		Scanner thirdAge = new Scanner(System.in);
		int tage = thirdAge.nextInt();
		
		if(fage<sage && fage<tage)
			System.out.println("First person is youngest");
		else if(sage<fage && sage<tage)
			System.out.println("Second person is youngest");
		else
			System.out.println("Third person is youngest");

	}

}
