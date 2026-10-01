package revision;

public class Patterns {
	
	static void display() {
		System.out.println("-----------------------------------------------------");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=65;i<70;i++) {
			for(int j=65;j<=i;j++) {
				if(i%2==0) {
					System.out.print((char)(j+32));
				}
				else {
					System.out.print((char)j);
				}
				
			}
			System.out.println();
		}
		
		display();
		for(int i=85;i<=90;i++) {
			if(i!=86) {
				for(int j=90;j>=i;j--) {
					if(j!=86)
					System.out.print((char)j);
				}
				System.out.println();
			}
			
			
		}
		display();
		for(int i=69;i>=65;i--) {
			if(i%2!=0) {
				for(int j=65;j<=i;j++) {
					System.out.print((char)j);
				}
				System.out.println();
			}
			
		}
		display();
		for(char i='V';i>='P';i--) {
			if((int)i%2==0) {
				for(char j='P';j<=i;j++) {
					if((int)j%2==0) {
						System.out.print(j);
					}
					
				}
				System.out.println();
			}
			
		}
		display();
		for(char i='E';i>='A';i--) {
			for(char j='A';j<=i;j++) {
				System.out.print(j+"*");
			}
			System.out.println();
		}
		display();
		
		for(char i='a';i<='b';i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(char i='A';i<='B';i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
