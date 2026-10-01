package pattern;

public class HollowInvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=4;i>=1;i--) {
			
			for(int s=4;s>i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(i==4 || i==j || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
