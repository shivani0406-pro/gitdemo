package demo;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dynamic memory location
		 * Contiguous memory location
		 */
		int arr[] = new int[5];
		int revArr[]= new int[5];
		System.out.println("Enter 5 numbers");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array:");
		for(int i=0; i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse");
		for(int i=4;i>=0;i--) {
			revArr[i]=arr[i];
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(revArr[i]+" ");
		}

	}

}
