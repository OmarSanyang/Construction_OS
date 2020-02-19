
public class Apartment extends Residential{

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public Apartment() {
		
	}// end constructor
	
	public Apartment(String projectName,String completeAddress,double totalSquareFeet,String occupancyGroup,String subgroup, int numBedrooms, int numBathrooms, boolean LaundryRoom,
			int numRentableUnits, double avgUnitSize, boolean parkingAvailable ) {
		
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup, numBedrooms, numBathrooms, LaundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}// end constructor
	
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the new value of draw
	*
	*/
	public void draw() {
		System.out.println(" Draw for <<Apartment>>");
		
	}// end of draw
	
	public String displayData() {
		
		char L;
		char P;
		
		if(LaundryRoom == true )
			L = 'Y';
		else 
			L = 'N';
		if(parkingAvailable == true)
			P = 'Y';
		else
			P = 'N';
		
		return  "Project Name: " + projectName +"\n Address: " + completeAddress +"\n Square Feet: " + totalSquareFeet
				+ "\n Occupancy Group: " + occupancyGroup + "\n Subgroup: " + subgroup + "\n Number of Bedrooms: " + numBedrooms + 
				"\n Number of Bathroom: " + numBathrooms + "\n LaundryRoom: " + L + "\n Number of RentableUnits: " + numRentableUnits +
				"\n Average UnitSize" + avgUnitSize + "\n Parking Available: " + P;
		
	}// end of displayData

	
	/**
	* @return the current value of NumRentableUnits */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	/**
	* @param Subgroud the value of NumRentableUnits to be set */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	/**
	* @return the current value of AvgUnitSize */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}// end of getAvgUnitSize

	/**
	* @param Subgroud the value of AvgUnitSize to be set */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}// end of setAvgUnitSize

	/**
	* @return the current value of ParkingAvailable */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}// end of isParkingAvailable

	/**
	* @param Subgroud the value of ParkingAvailable to be set */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}// end of setParkingAvailable

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}//end toString
	
}//end class
