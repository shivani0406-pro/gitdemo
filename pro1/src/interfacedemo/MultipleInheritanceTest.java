package interfacedemo;

interface A{
	void show();
}

interface B{
	void display();
}

class Test implements A,B{

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

	@Override
	public void show() {
		System.out.println("Show method");
		
	}
	
}

public class MultipleInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a ;
		a=new Test();
		a.show();
		
		B b ;
		b = new Test();
		b.display();

	}

}
