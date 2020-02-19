/**
 * 
 * @author omarsanyang
 *
 */
public class Business extends Building{
	
	protected int numRentableUnits;
	
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public Business() {
		super();
		numRentableUnits = 0;
	}// end constructor
	
	public Business(String projectName,String completeAddress,double totalSquareFeet,String occupancyGroup,String subgroup, int numRentableUnits) {
		super(projectName , completeAddress, totalSquareFeet ,occupancyGroup ,subgroup);
		this.numRentableUnits = numRentableUnits;
	}// end constructor
	
	/**
	* @return the current value of NumRentableUnits */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}// end of getNumRentableUnits
	
	/**
	* @param Subgroud the value of NumRentableUnits to be set */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}// end of setNumRentableUnits

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
	

}//end class
