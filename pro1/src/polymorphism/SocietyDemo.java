package polymorphism;


class Society{
	
	// Instance variables
    int memberNo;
    String memberName;
    double areaOfFlat;
    double propertyTax;
    
    
    // Static variable
    static double commonCharges = 2500;
    
    // Constructor
    Society(int memberNo, String memberName, double areaOfFlat, double propertyTax) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.areaOfFlat = areaOfFlat;
        this.propertyTax = propertyTax;
    }
    
 // Static function
    static void changeCommonCharges(double newCharges) {
        commonCharges = newCharges;
    }
    
    
    // Normal function
    void display() {
        System.out.println("Member No     : " + memberNo);
        System.out.println("Member Name   : " + memberName);
        System.out.println("Flat Area     : " + areaOfFlat + " sq.ft");
        System.out.println("Property Tax  : " + propertyTax);
        System.out.println("Common Charges: " + commonCharges);
        System.out.println("----------------------------");
    }
}

public class SocietyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Society s1 = new Society(101, "Rahul", 850, 5000);
        Society s2 = new Society(102, "Priya", 1000, 6500);
        Society s3 = new Society(103, "Amit", 750, 4500);
        
        s1.display();
        s2.display();
        s3.display();
        
        // Calling static function
        Society.changeCommonCharges(3000);
        System.out.println("After changing common charges:\n");
        s1.display();
        s2.display();
        s3.display();

	}

}
