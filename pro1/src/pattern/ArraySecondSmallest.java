package pattern;

public class ArraySecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,4,2,1,8};
		int smallest = arr[0];
		int secondSmallest = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
		}
		System.out.println("Second smallest: "+secondSmallest);

	}

}
