package oops;

public class StudentTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student01 s = new Student01();
		//s.roll = 222;
		//s.name = "shivani";
		
		s.setRoll(222);
		s.setName("shivani");
		
		int roll = s.getRoll();
		String name = s.getName();
		
		System.out.println("roll: "+roll);
		System.out.println("name: "+name);
				

	}

}
