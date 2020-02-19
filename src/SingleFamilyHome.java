
public class SingleFamilyHome extends Residential{

	private boolean garage;
	
	public SingleFamilyHome() {
		
	}// end constructor
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public SingleFamilyHome(String projectName,String completeAddress,double totalSquareFeet,String occupancyGroup,String subgroup,int numBedrooms,
			int numBathrooms, boolean LaundryRoom, boolean garage) {
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup, numBedrooms, numBathrooms,LaundryRoom);
		this.garage = garage;
		
	}// end constructor
	
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the new value of draw
	*
	*/
	public void draw() {
		System.out.println("Draw for <<SingleFamilyHome>>");
	}// end of draw
	
	public String displayData(){
		 
		char L;
		char G;
		
		if(LaundryRoom == true )
			L = 'Y';
		else 
			L = 'N';
		if(garage == true)
			G = 'Y';
		else
			G = 'N';
		
		
		return "Project Name: "   + projectName +"\n Address: " + completeAddress +"\n Square Feet: " + totalSquareFeet + "\n Occupancy Group: " + occupancyGroup + "\n Subgroup: " + subgroup
		+ "\n Number of Bedrooms: " + numBedrooms + "\n Number of Bathroom: " + numBathrooms + "\n garage: " + G + "\n LaundryRoom: " + L;
		
	}// end of displayData

	/**
	* @return the current value of Garage */
	public boolean isGarage() {
		return garage;
	}// end of isGarage
	
	/**
	* @param Subgroud the value of Garage to be set */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}// end of setGarage

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}//end toString
	
	
	
}//end class
