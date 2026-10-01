package revision;

public class PatternDay2 {

	static void display() {
		System.out.println("--------------------------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// -----------Hallow full triangle

		for (int i = 0; i < 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				if (i == 0 || i == j || j == 0 || i == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}
		display();

		// -------------------Hallow Inverted Triangle
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 4; j >= i; j--) {
				if (i == 0 || i == j || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		display();

		// ----------------------------Diamond Pattern
		for (int i = 0; i < 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");

			}

			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 4; j >= i; j--) {

				System.out.print("* ");

			}
			System.out.println();
		}
		display();
		//-------------------------Hallow diamond
		for (int i = 0; i < 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				if(i==0 || j==i || j==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 4; j >= i; j--) {
				if( j==4 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		display();
		//-----------------Floyd's triangle
		
		int count = 1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		display();
		//---------------------Binary Triangle
		int num=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if(num==1) {
					num = 0;
				}
				else {
					num=1;
				}
				System.out.print(num);
			}
			System.out.println();
		}
		display();
		//-------------------Pascal's Triangle
		int pascalNum = 1;
		for(int i=1;i<6;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.println(pascalNum);
			pascalNum *=11;
		}
		display();
		//-------------------Pascal's Triangle space in between
		int pascalNum1 = 1;
		for(int i=0;i<5;i++) {
			for(int k=5; k>=i;k--) {
				System.out.print(" ");
			}
			int digit = 0;
			int temp = pascalNum1;
			while(temp!=0) {
				digit = temp%10;
				System.out.print(digit+" ");
				temp = temp/10;
			}
			pascalNum1*=11;
			System.out.println();
			
			
		}
		

	}

}
