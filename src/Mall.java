
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public Mall() {
		
	}// end constructor
	
	public Mall(String projectName,String completeAddress,double totalSquareFeet,String occupancyGroup,String subgroup, int numRentableUnits, 
			int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		
		super(projectName,completeAddress, totalSquareFeet,occupancyGroup,subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
		
		
	}// end constructor
	
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the new value of draw
	*
	*/
	public void draw() {
		System.out.println("Draw for <<Mall>>");
		
	}// end of draw
	
	public String displayData() {
		return "Project Name: " + projectName +"\n Address: " + completeAddress +"\n Square Feet: " + totalSquareFeet
		+ "\n Occupancy Group: " + occupancyGroup + "\n Subgroup: " + subgroup + "\n Num of RentableUnits: " + numRentableUnits 
		+ "\n Number of RentedUnits" + numRentedUnits + "\n Median Size Unit :" + medianUnitSize + "\n Nummer of ParkingSpaces: " + numParkingSpaces;
		
	}// end of displayData
	
	
	/**
	* @return the current value of NumRentedUnits */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	/**
	* @return the current value of NumRentedUnits */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	/**
	* @return the current value of MedianUnitSize */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}// end of getMedianUnitSize

	/**
	* @param Subgroud the value of MedianUnitSize to be set */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}// end of setMedianUnitSize

	
	/**
	* @return the current value of NumParkingSpaces */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}// end of getNumParkingSpaces
	
	
	/**
	* @param Subgroud the value of NumParkingSpaces to be set */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}// end of setNumParkingSpaces

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}//end toString
	
	
	
}//end class
