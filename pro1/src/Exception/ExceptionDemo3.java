package Exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = null;
			System.out.println(s.length());
			
			int a =10/0;
			System.out.println(a);
			
			int a1[] = new int[10];
			System.out.println(a1[11]);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
