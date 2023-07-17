
public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvaliable;
	
	public Apartment() {//empty arg constructor using super to get parent parameters
		super();
		setNumRentableUnits(0);
		setAvgUnitSize(0.0);
		setParkingAvaliable(false);
	}

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {//preferred constructor using super to get parent parameters
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumRentableUnits(numRentableUnits);
		setAvgUnitSize(avgUnitSize);
		setParkingAvaliable(parkingAvaliable);
	}
	//start getters/setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvaliable() {
		return parkingAvaliable;
	}

	public void setParkingAvaliable(boolean parkingAvaliable) {
		this.parkingAvaliable = parkingAvaliable;
	}
	//end getters/setters
	
	public void draw() {//calls super draw method
		super.draw();
	}
	
	public String displayData() {
		
		String bool = "";
		if (isParkingAvaliable()==false) {
			bool = "N";
		}
		else if (isParkingAvaliable()==true) {
			bool = "Y";
		}//converts Parking bool to formatted string
		
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("Average Unit Size: " + getAvgUnitSize() + "\n");
		sb.append("Parking: " + bool + "\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//appends new formatted data along with prior super method

	@Override
	public String toString() {//default toString() with parent parameters
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvaliable=" + parkingAvaliable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	
	
}
