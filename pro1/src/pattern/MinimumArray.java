package pattern;

public class MinimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,48};
		
		int min = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum number is: "+min);

	}

}
