package wrapperdemo;

public class WrapperUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = new Integer(10);
		
		int a = i.intValue();
		System.out.println(a);
		System.out.println(i.hashCode());// Integer class override hashcode() and prints the value itself.
		
		Double b = new Double(10);// Double class override hashcode() and prints the value itself.
		String s = new String("name");
		
	}

}
