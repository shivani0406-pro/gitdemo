package revision;

import java.util.Scanner;

public class SingleArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 10 numbers");
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Select your choice");
		System.out.println("1.Display Reverse Array\n"
				+ "2.Copy one array to another\n"
				+ "3.Print only positive numbers\n"
				+ "4.Count Positive, Negative and Zero\n"
				+ "5.Count Odd and Even\n"
				+ "6.Replace Even numbers with 0\n"
				+ "7.Find maximum and minimum together");
		int choice = sc.nextInt();
		
		System.out.println("Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		switch(choice) {
		case 1: 
			System.out.println("Reverse Array:");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
			break;
		case 2: 
			System.out.println("Copy One array into another");
			int arrcopy[] = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				arrcopy[i]=arr[i];
				System.out.print(arrcopy[i]+" ");
			}
			break;
		case 3:
			System.out.println("Positive Numbers:");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=0) {
					System.out.print(arr[i]+" ");
				}
			}
			break;
		case 4:
			int pcount = 0;
			int ncount = 0;
			int zcount = 0;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>0) {
					pcount++;
				}
				else if(arr[i]<0) {
					ncount++;
				}
				else {
					zcount++;
				}
			}
			System.out.println("Positive Number count: "+pcount+"\nNegative Number count: "+ncount+"\n"
					+ "Zero number count: "+zcount);
			break;
		case 5:
			int ecount=0;
			int ocount=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					ecount++;
				}
				else {
					ocount++;
				}
			}
			System.out.println("Count of even numbers: "+ecount+"\n"
					+ "Count of odd numbers: "+ocount);
			break;
		case 6:
			
			System.out.println("Replace Array:");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					arr[i]=0;
				}
				System.out.print(arr[i]+" ");
			}
			break;
		case 7:
			int max = arr[0];
			int min = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(max<arr[i]) {
					max = arr[i];
				}
				if(min>arr[i]) {
					min = arr[i];
				}
			}
			System.out.println("Max: "+max+" Min: "+min);
			break;
			default:
				System.out.println("Invalid choice");
			
		}

	}

}
