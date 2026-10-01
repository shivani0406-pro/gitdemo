package inheritanceassigment;

public class ParkingSlot {
	
	protected int slotNumber;
	protected int vehicleNumber;
	protected int parkingHrs;
	
	public ParkingSlot() {
		
	}
	
	public ParkingSlot(int slotNumber, int vehicleNumber, int parkingHrs) {
		super();
		this.slotNumber = slotNumber;
		this.vehicleNumber = vehicleNumber;
		this.parkingHrs = parkingHrs;
	}
	
	void displayslot() {
		System.out.println("Slot Number: "+slotNumber);
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Parking Hours: "+parkingHrs);
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getParkingHrs() {
		return parkingHrs;
	}

	public void setParkingHrs(int parkingHrs) {
		this.parkingHrs = parkingHrs;
	}
	
	

}
