package revision;

import java.util.Scanner;

public class BuzzNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[20];

		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter 20 numbers");
		  for(int i=0;i<2;i++) { 
			  nums[i] = sc.nextInt();
			  
		  
		  }
		  
		  System.out.println("Perfect Numbers: ");
		 
		  for(int i=0;i<2;i++) {
			  int sum=0;
			  
			  for(int j=1;j<=nums[i]/2;j++) {
				  
				  if(nums[i]%j==0) {
					  sum=sum+j;
				  }
				  if(sum==nums[i]) {
					 
					  System.out.print(nums[i]+" ");
					 
				  }
				  
			  }
		  }
		  
		  System.out.println();
		  System.out.println("Buzz Numbers:");
		  for(int i=0;i<2;i++) {
			  if(nums[i]%7==0) {
				 
				  System.out.print(nums[i]+" ");
			  }
		  }
		  
		  
		  
		 

	}

}
