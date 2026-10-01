package inheritance;

class Person2{
	String name = "Parent";
}
class Student2 extends Person2{
	String name = "Child";
	void display() {
		System.out.println("name: "+name);
		System.out.println("This.name: "+this.name);
		System.out.println("Super name: "+super.name);
	}
}
public class ThisVsSuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2();
		s.display();
	}

}
