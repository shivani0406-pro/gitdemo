package demo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			arr[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("Array:");
		for(int i=0;i<5;i++) {
			
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		
		
		
		System.out.println("Sum: "+sum);

	}

}
