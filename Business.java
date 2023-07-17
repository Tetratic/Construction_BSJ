
public class Business extends Building {

	protected int numRentableUnits;
	
	public Business() {//empty arg constructor using super to get parent parameters
		super();
		setNumRentableUnits(0);
	}
	
	public Business(String projectName,String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {//preferred constructor using super to get parent parameters
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup);
		setNumRentableUnits(numRentableUnits);
	}
	//start getters/setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	//end getters/setters
	
	public void draw() {
		super.draw();
	}//calls super draw method
	
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("==================================\n");
		
		return sb.toString();
	} //formats data as it was in the higher class, appending new data for the more specific subclass

	@Override
	public String toString() { //default toString with parent parameters included
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	
	
}
