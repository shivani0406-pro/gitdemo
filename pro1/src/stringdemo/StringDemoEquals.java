package stringdemo;

public class StringDemoEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "vedant";
		String s2 = "VEDANT";
		String s3 = "vedanT";
		String s4 = new String("VEDANT");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3)); // reads data
		
		System.out.println("By using ==");
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		String s5 = "vedant"; 
		System.out.println(s1==s5);// reads reference
	}

}
