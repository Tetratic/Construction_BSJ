
public class SingleFamilyHome extends Residential {

	private boolean garage;
	
	public SingleFamilyHome() {//empty arg constructor using super to get parent parameters
		super();
		setGarage(false);
	}

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {//preferred constructor using super to get parent parameters
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setGarage(garage);
	}
	//start getters/setters
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public void draw() {
		super.draw();
	}
	//end getters/setters
	
	public String displayData() {
		
		String bool = "";
		if (isGarage()==false) {
			bool = "N";
		}
		else if (isGarage()==true) {
			bool = "Y";
		}//converts garage bool into formatted string
		
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Garage: " + bool + "\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//appends new formatted data along with prior super method

	@Override
	public String toString() {//default toString() with parent parameters
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	
	
}
