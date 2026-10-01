package inheritance;

class Person{
	public Person() {
		System.out.println("Person constructor");
	}
}
class Student extends Person{
	public Student() {
		super();
		System.out.println("Child constructor");
		 //super(); //Constructor call must be the first statement in a constructor
	}
}

public class SuperMethodex {

	public static void main(String[] args) {
		Student s = new Student();
		
	}

}
