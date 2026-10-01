package polymorphism;

public class Calculator {
	
	void add(int a, int b) {
		System.out.println("Sum: "+(a+b));
	}
	
	void add(int a,int b, int c) {
		System.out.println("Sum: "+(a+b+c));
	}
	
	void add(double a, double b) {
		System.out.println("Sum: "+(a+b));
	}
	
	void add(int... nums) {
		int sum =0;
		for(int num:nums) {
			sum+=num;
		}
		System.out.println("Sum: "+sum);
		
	}

}
