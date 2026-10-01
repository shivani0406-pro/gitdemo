package pattern;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++) {
			
			for(int s=4;s>=i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(i-1+" ");
				}
				
			}
			System.out.println();
		}

	}

}
