package pattern;

public class ArraySecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,4,9};
		int largest = arr[0];
		int secondLargest = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}
		}
		System.out.println("SecondLargest: "+secondLargest);

	}

}
