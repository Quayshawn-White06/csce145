
public class coffeBackUp {

}
//instance variables
	private String name;
	private double caffine;
	
	//default constructor
	public Coffee()
	{
		this.name="none";
		this.caffine=0;
	}
	//paramiterized constructor
	public Coffee(String xName, double xCaffine)
	{
		this.setName(xName);
		this.setCaffine(xCaffine);
	}
	
	//accessors=only access
	public String getName()
	{
		return this.name;
	}
	
	public double getCaffine()
	{
		return this.caffine;
	}
	
	//mutators change the info
	public void setName(String xName)
	{
		this.name=xName;
	}
	
	public void setCaffine(double xCaffine)
	{
		if(xCaffine>0)
		{
		this.caffine=xCaffine;
		}
		else
		{
			System.out.println("Invalid value entered for weight of pet!");
		}
	}
	//other methods
	public String toString()
	{
		return "Name:"+this.name+"\nCaffine: "+this.caffine+"mg";
	}