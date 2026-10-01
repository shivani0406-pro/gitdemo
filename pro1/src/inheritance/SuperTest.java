package inheritance;

class Parent{
	int x = 10;
}
class Child extends Parent{
	int x = 20;
	void display() {
		System.out.println("Child x: "+x);
		System.out.println("Parent x: "+super.x);// super keyword refers to immediate parent class object
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.display();

	}

}
