
public class Residential extends Building {

	protected int numBedrooms, numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {//empty arg constructor using super to get parent parameters
		super();
		setNumBedrooms(0);
		setNumBathrooms(0);
		setLaundryRoom(false);
	}

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {//preferred constructor using super to get parent parameters
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumBedrooms(numBedrooms);
		setNumBathrooms(numBathrooms);
		setLaundryRoom(laundryRoom);
	}
	//start getters/setters
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	//end getters/setters
	
	public void draw() {//calls super draw method
		super.draw();
	}
	
	public String displayData() {
		
		String bool = "";
		if (isLaundryRoom()==false) {
			bool = "N";
		}
		else if (isLaundryRoom()==true) {
			bool = "Y";
		}//converts laundry bool to formatted string
		
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Laundry Room: " + bool + "\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//appends new formatted data along with prior super method

	@Override
	public String toString() { //default toString() with parent parameters included
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}
	
	
}
