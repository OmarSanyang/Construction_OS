
public class TestApplication {

	public static void main(String[] args) {
		

		System.out.println("--------------------------------------");
		System.out.println("Building");
		System.out.println("--------------------------------------");
		
		Building b = new Building();
		Building build = new Building("Athletic House","9524 Melrose Drive, Overland Pack Ks 662145",2540,"Recovery Building","R1");
		System.out.println("\n" + build.displayData() + "\n");
		build.draw();
		System.out.println();
		
		build.setProjectName("My Building");
		System.out.println(build.getProjectName());
	
		build.setCompleteAddress("9524 Melrose Drive, Overland Pack Ks 662145");
		System.out.println(build.getCompleteAddress());
		build.setTotalSquareFeet(7054.65892);
		
		System.out.println(build.getTotalSquareFeet());
		build.setOccupancyGroup("VidoeGame Building");
		System.out.println(build.getOccupancyGroup());
		build.setSubgroup("Academic Building");
		
		System.out.println(build.getSubgroup());
		System.out.println();
		System.out.println(build.toString());
		
		
		System.out.println("--------------------------------------");
		System.out.println("Business");
		System.out.println("--------------------------------------");
		
		Business E = new Business();
		Business B = new Business("Business", "9524 Melrose Drive, Overland Pack Ks 662145", 65721.7650, "Business", "Group B", 43);
		B.setNumRentableUnits(74);
		System.out.println("\n\n" + B.getNumRentableUnits());
		System.out.println(B.toString() + "\n\n");
		
		System.out.println("--------------------------------------");
		System.out.println("Residential");
		System.out.println("--------------------------------------");
		
		Residential N = new Residential();
		Residential R = new Residential("Residential", "9524 Melrose Drive, Overland Pack Ks 662145", 8900.69, "Residential", "Groups R-1 to R-4", 1, 2, true);
		R.setNumBathrooms(7);
		R.setNumBedrooms(9);
		R.setLaundryRoom(false);
		System.out.println("\n\n" + R.getNumBedrooms() + " " + R.getNumBathrooms() + " " + R.isLaundryRoom());
		System.out.println(R.toString() + "\n\n");
		
		System.out.println("--------------------------------------");
		System.out.println("Mall");
		System.out.println("--------------------------------------");
		Mall M = new Mall();
		System.out.println(M.displayData());
		
		Mall m = new Mall("OakPackMall", "9524 Melrose Drive, Overland Pack Ks 662145", 65679.64245, "Business", "Group B",
				78, 67, 825.95, 12000);
		System.out.println("\n" + m.displayData() + "\n");
		m.draw();
		m.setNumRentedUnits(15);
		m.setMedianUnitSize(75.34);
		m.setNumParkingSpaces(5000);
		System.out.println("\n" + m.getNumRentedUnits() + " " + m.getMedianUnitSize() + " " + m.getNumParkingSpaces());
		System.out.println(m.toString());
		
		System.out.println("--------------------------------------");
		System.out.println("Apartmen");
		System.out.println("--------------------------------------");
		
		Apartment A = new Apartment("Oakpark", "9524 Melrose Drive, Overland Pack Ks 66214", 9000.241, "Residential", "R-3", 1, 1, false, 16, 130.55, true);
		System.out.println("\n" + A.displayData() + "\n");
		A.draw();
		
		A.setNumRentableUnits(35);
		A.setAvgUnitSize(134.55);
		A.setParkingAvailable(false);
		
		System.out.println("\n" + A.getNumRentableUnits() + " " + A.getAvgUnitSize() + " " + A.isParkingAvailable());
		System.out.println(A.displayData());
		
		System.out.println("--------------------------------------");
		System.out.println("SingleFamilyHome");
		System.out.println("--------------------------------------");
		
		SingleFamilyHome D = new SingleFamilyHome();
		System.out.println(D.displayData());
		
		SingleFamilyHome single = new SingleFamilyHome("My House", "9524 Melrose Drive, Overland Pack Ks 66214", 66214, "Residential", "R-3", 4, 3, true, true);
		System.out.println("\n" + single.displayData() + "\n");
		single.draw();
		single.setGarage(false);
		System.out.println(single.isGarage());
		
		System.out.println(single.toString());
		System.out.println("--------------------------------------");

	}

}//end class
