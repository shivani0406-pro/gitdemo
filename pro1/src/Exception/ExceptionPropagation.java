package Exception;


/*Exception propagation in Java is the process by which an exception travels up the call 
 * stack from the method where it occurred to the calling methods until it is caught by an appropriate try-catch block. If the exception travels all the way to the bottom of the stack (the main method) without being handled, 
the Java Virtual Machine (JVM) terminates the program and prints the stack trace.

*/
class A{
	void get1() {
		int result = 10/0;
		System.out.println(result);
	}
}

class B extends A{
	void get2() {
		get1();
	}
}

class C extends B{
	void get3() {
		get2();
	}
}

public class ExceptionPropagation {

	public static void main(String[] args) {
		try {
			C c = new C();
			c.get3();
		}
		catch (Exception e) {
			System.out.println("Handle in Main: "+e);
		}
	}

}
