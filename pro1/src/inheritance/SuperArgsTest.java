package inheritance;

class Person1{
	String name;

	public Person1(String name) {
		
		this.name = name;
	}
	
}

class Student1 extends Person1{
	int rollNo;
	public Student1(String name, int rollNo) {
		super(name);
		this.rollNo = rollNo;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
	}
}

public class SuperArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s =new Student1("Shivani", 101);
		s.display();
	}

}
