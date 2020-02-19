/**
 * 
 * @author omarsanyang
 * Building Project
 * 2nd Semester/2020
 */

public class Building {
	
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	
	/**
	* This is empty-argument constructor that initialize the instance
	variables */
	public  Building() {
		super();
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subgroup = " ";
	}// end constructor
	
	public Building(String projectName,String completeAddress,double totalSquareFeet,String occupancyGroup,String subgroup) {
		super();
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}// end constructor
	
	
	/**
	* This demonstrates a void method.
	*
	* @param a the value sent in to the method * @return the new value of draw
	*
	*/
	public void draw() {
		
		System.out.println(" Draw for <<Building>>");
		
	}// end of draw
	
	
	/**
	* @return the current value of displayData */
	public String displayData() {
		return "Project Name: " + projectName +"\n Address: " + completeAddress +"\n Square Feet: " + totalSquareFeet + "\n Occupancy Group: " 
	+ occupancyGroup + "\n Subgroup: " + subgroup;
	 
		
	}// end of displayData

	
	/**
	* @return the current value of ProjectName */
	public String getProjectName() {
		return projectName;
	}// end of getProjectName

	/**
	* @param Subgroud the value of ProjectName to be set */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}// end of setProjectName

	
	/**
	* @return the current value of CompleteAddress */
	public String getCompleteAddress() {
		return completeAddress;
	}// end of getCompleteAddress
	

	
	/**
	* @param Subgroud the value of CompleteAddress to be set */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}// end of setCompleteAddress

	
	/**
	* @return the current value of TotalSquareFeet */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}// end of getTotalSquareFeet

	
	/**
	* @param Subgroud the value of TotalSquareFeet to be set */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}// end of setTotalSquareFee

	/**
	* @return the current value of OccupancyGroup */
	
	public String getOccupancyGroup() {
		return occupancyGroup;
	}// end of String getOccupancyGroup

	/**
	* @param Subgroud the value of OccupancyGroup to be set */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}// end of setOccupancyGroup

	
	/**
	* @return the current value of Subgroud */
	
	public String getSubgroup() {
		return subgroup;
	}// end of getSubgroup

	
	/**
	* @param Subgroud the value of Subgroud to be set */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	} // end of setSubgroup

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString



}//end class
