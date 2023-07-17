
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {//empty arg constructor using super to get parent parameters
		super();
		setNumRentedUnits(0);
		setMedianUnitSize(0.0);
		setNumParkingSpaces(0);
	}
	
	public Mall(String projectName,String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {//preferred constructor using super to get parent parameters
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup);
		setNumRentedUnits(numRentedUnits);
		setMedianUnitSize(medianUnitSize);
		setNumParkingSpaces(numParkingSpaces);
	}
	//start getters/setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	//end getters/setters
	
	public void draw() {//calls super draw method
		super.draw();
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Number of Rented Units: " + getNumRentedUnits() + "\n");
		sb.append("Median Unit Size: " + getMedianUnitSize() + "\n");
		sb.append("Number of Parking Spaces: " + getNumParkingSpaces() + "\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//formats new data and appends it to already determined super method

	@Override
	public String toString() { //default toString() with parent parameters included
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	
	
	
	
}
