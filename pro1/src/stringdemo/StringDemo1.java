package stringdemo;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome";
		String s1 = new String(" India");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.hashCode());
		
		s.concat(s1);
		System.out.println("After concat: "+s);
		
		s = s.concat(s1);
		System.out.println("After mutable concat: "+s);
		
		System.out.println("Operations on String");
		System.out.println("length: "+s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('e'));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.repeat(2));
		System.out.println(s.toUpperCase());
		
		String b = "Batman";
		String b1 = "Batman";
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
		
	}

}
