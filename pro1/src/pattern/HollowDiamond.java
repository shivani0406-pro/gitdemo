package pattern;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4;i++) {
			
			for(int s=4;s>i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
			
			for(int s=4;s>i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if( i==j || j==1) {
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
