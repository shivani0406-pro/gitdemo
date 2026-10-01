package polymorphism;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1,"Vaishali");
		Student s2 = new Student(2, "Shivani");
		
		s1.display();
		s2.display();
		
		Student.college = "XYZ College";
		s1.display();
		s2.display();
		
		/* We can create object of static variable
		 * but not needed as it share memory with all
		 * instances.
		 *  
		 * If we change for one object it will reflect others.
		 *  
		 *  */
		
		s1.college = "AC college";
		s1.display();
		s2.display();

	}

}
