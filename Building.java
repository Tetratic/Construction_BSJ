
public class Building {

	protected String projectName, completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup, subgroup;
	
	public Building() {//empty arg constructor
		setProjectName("");
		setCompleteAddress("");
		setTotalSquareFeet(0.0);
		setOccupancyGroup("");
		setSubgroup("");
	}
	public Building(String projectName,String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {//preferred constructor
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
	}
	//start getters/setters
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCompleteAddress() {
		return completeAddress;
	}
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	public String getOccupancyGroup() {
		return occupancyGroup;
	}
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
	public String getSubgroup() {
		return subgroup;
	}
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	//end getters setters
	
	public void draw() {
		System.out.println("Drawing code for "+this.getClass().toString().substring(6)+".");
	}//calls for the class and converts it to a substring containing exactly the class-name, as .getClass() returns "class <<class>>"
	
	public String displayData() {//formats the data of the object in a neat manner
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+getProjectName()+"\n");
		sb.append("Complete Address: "+getCompleteAddress()+"\n");
		sb.append("Total Square Footage: "+getTotalSquareFeet()+"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup()+"\n");
		sb.append("Subgroup: "+getSubgroup()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}
	@Override
	public String toString() {//default toString()
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	
	
}
