package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 0 ;
		
		int digit =0;
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int orgNum=num;
		while(num!=0) {
			num = num/10;
			size++;
		}
		System.out.println(size);
		int arr[] = new int[size];
		
		int i=(size-1);
			while(orgNum!=0) {
				digit = orgNum%10;
				arr[i]=digit;
				orgNum=orgNum/10;
				i--;
			}
		
		System.out.println(Arrays.toString(arr));
		
//		for(int i=1;i<size-1;i++) {
//			System.out.print(arr[i]+" ");
//		}

	}

}
