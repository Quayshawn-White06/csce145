//brings the name and launch date from the ship class
public class CruiseShip extends Ship {

	
	//instance variables
	private int PassengerCapacity;
	private int CrewMembers;
	
	//default constructor
	CruiseShip()
	{
		this.PassengerCapacity= 00;
		this.CrewMembers=00;
	}
	
	//parameterized constructor
	CruiseShip(String name, String LaunchDate,int xPassengerCapacity,int xCrewMembers)
	{
		//super allows for overriding of the string
		super(name, LaunchDate);
		this.setPassengerCapacity(xPassengerCapacity);
		this.setCrewMembers(xCrewMembers);
	}
	
	
	//accessors
	
	public int getPassengersCapacity()
	{
		return this.PassengerCapacity;
	}
	
	public int getCrewMembers()
	{
		return this.CrewMembers;
	}
	//mutators
	public void setPassengerCapacity(int xPassengerCapacity)
	{
		this.PassengerCapacity=xPassengerCapacity;
	}
	
	public void setCrewMembers(int xCrewMembers)
	{
		this.CrewMembers=xCrewMembers;
	}
	
	 public String toString() {
	        
	        return super. toString() + "\nPassenger Capacity: " + PassengerCapacity + "\nNumber of Crew Members: " + CrewMembers;
	    }

}
