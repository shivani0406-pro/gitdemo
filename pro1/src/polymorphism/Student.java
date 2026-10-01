package polymorphism;

public class Student {
	
	private int rollNo;
	private String name;
	
	static String college = "ABC College";
	
	Student(int r,String n){
		rollNo=r;
		name=n;
	}
	
	void display() {
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("College: "+college);
		System.out.println("--------------------");
	}

}
