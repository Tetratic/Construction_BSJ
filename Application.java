import java.util.*;
public class Application {

	static String pname = "Gaines House", addr = "123 Main Street | Louisville, Kentucky 40201", occGrp = "Residential", sGrp = "R1";
	static int sft = 2540, rentableNum = 35, rentedNum = 25, nBeds=3, nBaths=2, nps = 350;
	static double aus = 2540.0, mus = 2540.0;
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Select the following option:");
		System.out.println("1: Building");
		System.out.println("2: Business");
		System.out.println("3: Residential");
		System.out.println("4: Mall");
		System.out.println("5: Apartment");
		System.out.println("6: Single Family Home");
		int sw = input.nextInt();//user interface to have the testing output be a bit more readable
		
		switch (sw) {//switch case to test the user given class
		case 1: BuildTest();
			break;
		case 2: BusinTest();
			break;
		case 3: ResidTest();
			break;
		case 4: MallTest();
			break;
		case 5: ApartTest();
			break;
		case 6: SinglTest();
			break;
		default: System.out.println("Invalid option, please try again.");
		}
		input.close();
	}

	public static void BuildTest() {
		Building bld = new Building();
		Building bld2 = new Building(pname, addr, sft, occGrp, sGrp);
		//objects using both constructors
		
		bld.draw();
		bld2.draw();
		//test draw method for Building class
		
		System.out.println(bld.displayData());
		System.out.println(bld2.displayData());
		//test displayData method for Building class
		
		System.out.println(bld.toString());
		System.out.println(bld2.toString());
		//test toString()
		
		bld.setProjectName(pname);
		bld.setCompleteAddress(addr);
		bld.setTotalSquareFeet(sft);
		bld.setOccupancyGroup(occGrp);
		bld.setSubgroup(sGrp);
		System.out.println(bld.displayData());
		//test setters
		
		System.out.println(bld2.getProjectName());
		System.out.println(bld2.getCompleteAddress());
		System.out.println(bld2.getTotalSquareFeet());
		System.out.println(bld2.getOccupancyGroup());
		System.out.println(bld2.getSubgroup());
		//test getters
	
	}
	public static void BusinTest() {
		Business bld = new Business();
		Business bld2 = new Business(pname, addr, sft, occGrp, sGrp);
		//objects using both constructors
		
		bld.draw();
		bld2.draw();
		//test draw method for Building class
		
		System.out.println(bld.displayData());
		System.out.println(bld2.displayData());
		//test displayData method for Building class
		
		System.out.println(bld.toString());
		System.out.println(bld2.toString());
		//test toString()
		
		bld.setNumRentableUnits(rentableNum);
		System.out.println(bld.displayData());
		//test setters
		
		System.out.println(bld.getNumRentableUnits());
		//test getters
		

		
	}
	public static void ResidTest() {
		Residential bld = new Residential();
		Residential bld2 = new Residential(pname, addr, sft, occGrp, sGrp);
		//objects using both constructors
		
		bld.draw();
		bld2.draw();
		//test draw method for Building class
		
		System.out.println(bld.displayData());
		System.out.println(bld2.displayData());
		//test displayData method for Building class
		
		System.out.println(bld.toString());
		System.out.println(bld2.toString());
		//test toString()
		
		bld.setNumBedrooms(nBeds);
		bld.setNumBathrooms(nBaths);
		bld.setLaundryRoom(true);
		System.out.println(bld.displayData());
		//test setters
		
		System.out.println(bld.getNumBedrooms());
		System.out.println(bld.getNumBathrooms());
		System.out.println(bld.isLaundryRoom());
		//test getters
		
	}
	public static void MallTest() {
		Mall bld = new Mall();
		Mall bld2 = new Mall(pname, addr, sft, occGrp, sGrp);
		//objects using both constructors
		
		bld.draw();
		bld2.draw();
		//test draw method for Building class
		
		System.out.println(bld.displayData());
		System.out.println(bld2.displayData());
		//test displayData method for Building class
		
		System.out.println(bld.toString());
		System.out.println(bld2.toString());
		//test toString()
		
		bld.setNumRentedUnits(rentedNum);
		bld.setMedianUnitSize(mus);
		bld.setTotalSquareFeet(nps);
		System.out.println(bld.displayData());
		//test setters
		
		System.out.println(bld.getNumRentedUnits());
		System.out.println(bld.getMedianUnitSize());
		System.out.println(bld.getNumParkingSpaces());
		//test getters
		
	}
	public static void ApartTest() {
		Apartment bld = new Apartment();
		Apartment bld2 = new Apartment(pname, addr, sft, occGrp, sGrp);
		//objects using both constructors
		
		bld.draw();
		bld2.draw();
		//test draw method for Building class
		
		System.out.println(bld.displayData());
		System.out.println(bld2.displayData());
		//test displayData method for Building class
		
		System.out.println(bld.toString());
		System.out.println(bld2.toString());
		//test toString()
		
		bld.setNumRentableUnits(rentableNum);
		bld.setAvgUnitSize(aus);
		bld.setParkingAvaliable(true);
		System.out.println(bld.displayData());
		//test setters
		
		System.out.println(bld.getNumRentableUnits());
		System.out.println(bld.getAvgUnitSize());
		System.out.println(bld.isParkingAvaliable());
		//test getters
		

		
	}
	public static void SinglTest() {
		SingleFamilyHome bld = new SingleFamilyHome();
		SingleFamilyHome bld2 = new SingleFamilyHome(pname, addr, sft, occGrp, sGrp);
		//objects using both constructors
		
		bld.draw();
		bld2.draw();
		//test draw method for Building class
		
		System.out.println(bld.displayData());
		System.out.println(bld2.displayData());
		//test displayData method for Building class
		
		System.out.println(bld.toString());
		System.out.println(bld2.toString());
		//test toString()
		
		bld.setGarage(true);
		System.out.println(bld.displayData());
		//test setters
		
		System.out.println(bld.isGarage());
		//test getters
		

		
	}
}
