package revision;

import java.util.Scanner;

public class BankInterestScheme {
	
	static void displayLine() {
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Term\tRate Of Interest(General)\t\tRate of Interest(Senior Citizen)");
		
		
		System.out.println("Enter Deposite Amount:");
		double amt = sc.nextDouble();
		
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		
		double interest = 0.0;
		double totalAmt = 0;
		
		System.out.println("1. Upto 1 year\n2. Upto 2 years\n3. Upto 3 years\n4. More than 3 years");
		
		System.out.println("Select your Term:");
		int term = sc.nextInt();
		if(age>=60) {
			switch(term) {
			case 1:
				interest = 8.0/100;
				
				break;
			case 2:
				interest = 9.0/100;
				
				break;
			case 3:
				interest = 10.0/100;
				
				break;
			case 4:
				interest = 11.0/100;
				
				break;
				default: 
					System.out.println("Invalid Term");
			}
		}
		else {
			switch(term) {
			case 1:
				interest = 7.5/100;
				
				break;
			case 2:
				interest = 8.5/100;
				
				break;
			case 3:
				interest = 9.5/100;
			
				break;
			case 4:
				interest = 10.0/100;
				
				break;
				default:
					System.out.println("Invalid Term");
			}
		}
		
		totalAmt = (amt*interest*term)+amt;
		
		displayLine();
		System.out.println("Amount Deposited\tTerm\tAge\tInterest Earned\t\tAmount Paid");
		displayLine();
		System.out.println(amt+"\t\t\t"+term+"\t"+age+"\t"+interest+"\t\t\t"+totalAmt);
		
sc.close();
	}

}
