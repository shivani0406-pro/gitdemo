package polymorphism;

class Student1{
	static String college = "ABC College";
	private static int rollNo;
	
	public Student1(int rollNo) {
		this.rollNo=rollNo;
	}

	static void displayCollege() {
		System.out.println("College: "+college+" RollNo: "+rollNo);
		/* A Static method can only call a static variable
		 * 
		 * static method cannot access to instance variable 
		 * bcoz instance variable require "this" pointer 
		 * and static variable or members do not have this pointer
		 * as they loads with class not instance
		 *  
		 *  */
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1.displayCollege();   //No object needed
		Student1 s = new Student1(100);
		s.displayCollege();

	}

}
