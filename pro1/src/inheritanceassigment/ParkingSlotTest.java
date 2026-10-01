package inheritanceassigment;

import java.util.Scanner;

public class ParkingSlotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter slotno");
		int slotno = sc.nextInt();
		System.out.println("Enter Vehicle No");
		int vehNum = sc.nextInt();
		System.out.println("Enter parking Hrs");
		int hr = sc.nextInt();
		System.out.println("Enter charging units");
		int cunits = sc.nextInt();
		System.out.println("Enter charging cost");
		int ccost = sc.nextInt();
		
		EVParkingSlot evpark = new EVParkingSlot(slotno, vehNum, hr, cunits, ccost);
		evpark.displayEVSlot();
		

	}

}
