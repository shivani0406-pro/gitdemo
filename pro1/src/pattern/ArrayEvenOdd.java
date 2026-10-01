package pattern;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		System.out.println("Enter 10 numbers");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		
		int evenCount=0;
		int oddCount = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
		

	}

}
