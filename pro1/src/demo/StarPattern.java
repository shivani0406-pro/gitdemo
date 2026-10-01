package demo;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r = 1; r <= 3; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("----------------------------");

		int r = 1;
		while (r <= 3) {
			int c = 1;
			while (c <= r) {
				System.out.print("*");
				c++;
			}
			System.out.println();
			r++;
		}
		
		System.out.println("----------------------------");
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		for(int i = 3; i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		int c=1;
		while(c<=5) {
			int d = 1;
			while(d<=c) {
				System.out.print(d);
				d=d+2;
			}
			System.out.println();
			c=c+2;
		}
		
		System.out.println("----------------------------");
		
		int a=10;
		while(a<=1000) {
			int b = 10;
			while(b<=a) {
				System.out.print(b+" ");
				b=b*10;
			}
			System.out.println();
			a=a*10;
		}
		
		System.out.println("----------------------------");
		
		for (int i = 1; i <= 3; i++) {
			
			for(int j = 1;j<=3-i;j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==i || j==(5-i+1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}



/*  
 * 1
 * 12
 * 123
 * 
 * 
 * 1
 * 22
 * 333
 * 
 * 333
 * 22
 * 1
 * 
 * 1
 * 13
 * 135
 * 
 * 10
 * 10 100
 * 10 100 1000
 * 
 *   *
 *  * *
 * * * *     Also this should be dynamic
 * 
 * 
 * X like structure
 * 
 * 
 * */
