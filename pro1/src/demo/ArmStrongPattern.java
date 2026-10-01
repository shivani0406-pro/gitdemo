package demo;

import java.util.Scanner;

public class ArmStrongPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int orgNum = num;
		int num2 = num;
		int rem = 0;
		int count = 0;
		int armStrong = 0;
		int digit=0;
		
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		int i = count-1;
		int arr[] = new int[count];
		while(orgNum!=0) {
			digit = orgNum % 10;
			arr[i]=digit;
			orgNum = orgNum/10;
			armStrong = armStrong+(digit*digit*digit);
			i--;
		}
		if(num2==armStrong) {
			System.out.println(num2+" is Armstrong Number");
			
			for(int j=1;j<=count;j++) {
				for(int k=0;k<j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
		
		

	}

}
