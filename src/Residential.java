
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean LaundryRoom;
	
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public Residential() {
		
	}// end constructor
	
	public Residential(String projectName,String completeAddress,double totalSquareFeet,String occupancyGroup,String subgroup, int numBedrooms, int numBathrooms, boolean LaundryRoom ) {
		
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.LaundryRoom = LaundryRoom;
	}// end constructor

	
	/**
	* @return the current value of NumBedrooms */
	public int getNumBedrooms() {
		return numBedrooms;
	}// end of getNumBedrooms

	/**
	* @param Subgroud the value of NumBedroomss to be set */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}// end of setNumBedrooms

	/**
	* @return the current value of NumBathrooms */
	public int getNumBathrooms() {
		return numBathrooms;
	}// end of getNumBathrooms

	/**
	* @param Subgroud the value of NumBathrooms to be set */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}// end of setNumBathrooms

	
	/**
	* @return the current value of LaundryRoom */
	public boolean isLaundryRoom() {
		return LaundryRoom;
	}// end of isLaundryRoom

	
	/**
	* @param Subgroud the value of LaundryRoom to be set */
	public void setLaundryRoom(boolean laundryRoom) {
		LaundryRoom = laundryRoom;
	}// end of setLaundryRoom

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", LaundryRoom="
				+ LaundryRoom + "]";
	}//end toString
	
	
}//end class
