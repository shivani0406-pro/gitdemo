package pattern;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,2,4,5,1};
		System.out.println("Enter element to search");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		boolean isFound=false;
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				isFound=true;
				break;
			}
		}
		System.out.println(isFound?"Found":"Not Found");

	}

}
