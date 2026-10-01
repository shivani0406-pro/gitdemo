package pattern;

public class MDArrayRowWiseTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2},{3,4}};
		
		
		for(int i=0;i<2;i++) {
			int sum=0;
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
				sum = sum + arr[i][j];
				
			}
			System.out.println();
			System.out.println(sum);
		}

	}



}
