
public class CargoShip extends Ship {

	
	//instance variables
	double tonnage;
	double MaximumSpeed;
	
	//default constructor
	CargoShip()
	{
		this.tonnage=0;
		this.MaximumSpeed=0;
	}
	
	//parameterized constructor
	CargoShip(String name, String LaunchDate,double xTonnage,double xMaximumSpeed)
	{
		super(name,LaunchDate);
		this.setTonnage(xTonnage);
		this.setMaximumSpeed(xMaximumSpeed);
	}
	//accessor
	public double getTonnage()
	{
		return this.tonnage;
	}
	
	public double getMaximumSpeed()
	{
		return this.MaximumSpeed;
	}
	
	//mutators
	
	public void setTonnage(double xTonnage)
	{
		this.tonnage=xTonnage;
	}
	
	public void setMaximumSpeed(double xMaximumSpeed)
	{
		this.MaximumSpeed=xMaximumSpeed;
	}
	public String toString()
	{
		return super.toString() +"\nTonnage:"+getTonnage()+" DWT"+"\nMaximum Speed:"+getMaximumSpeed()+" mph";
	}
	
}
