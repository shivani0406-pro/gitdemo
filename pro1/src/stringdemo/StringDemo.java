package stringdemo;

public class StringDemo {
	
	/* A class loader in java uses a String object as an argument.
	 * consider, if the string object is modifiable, the value might be changed 
	 * and the class that is supposed to be loaded might be different.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java";
		String s1 = s.concat(" Tech");
		System.out.println(s);
		System.out.println(s1);

	}

}
