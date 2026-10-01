package inheritanceassigment;

public class EVParkingSlot extends ParkingSlot{
	protected int chargingUnits;
	protected double chargingCost;
	
	public EVParkingSlot() {
		
	}
	
	public EVParkingSlot(int slotNumber, int vehicleNumber, int parkingHrs, int chargingUnits, double chargingCost) {
		super(slotNumber,vehicleNumber,parkingHrs);
		this.chargingUnits = chargingUnits;
		this.chargingCost = chargingCost;
	}
	
	void displayEVSlot() {
		displayslot();
		System.out.println("Charging Units: "+chargingUnits);
		System.out.println("Charging Cost: "+chargingCost);
	}

	public int getChargingUnits() {
		return chargingUnits;
	}

	public void setChargingUnits(int chargingUnits) {
		this.chargingUnits = chargingUnits;
	}

	public double getChargingCost() {
		return chargingCost;
	}

	public void setChargingCost(double chargingCost) {
		this.chargingCost = chargingCost;
	}
	
	

}
