
public class Coffee {
//quayshawn white
	
	//instance variables
	private String name;
	private double caffine;
	private double CafA;
	
	//default constructor
	public Coffee()
	{
		this.name="none";
		this.caffine=50;
		this.CafA=  180.0/((caffine / 100.0)*6.0);
	}
	//paramiterized constructor
	public Coffee(String xName, double xCaffine,double xCafA)
	{
		this.setName(xName);
		this.setCaffine(xCaffine);
		this.setCafA(xCafA);
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
	public double getCafA()
	{
		return this.CafA;
	}
	
	//mutators change the info
		public void setName(String xName)
		{
			this.name=xName;
		}
		
		public void setCaffine(double xCaffine)
		{
			this.caffine=xCaffine;
			
		}
		public void setCafA(double xCafA)
		{
			this.CafA=xCafA;
		}
	
	//other methods
		//determines if the coffee classes are the same based off the caffine amount 
		public boolean equals(Coffee c)
		{
			return c.getCaffine()==(this.caffine);
		}
	public String toString()
	{
		return "Name:"+this.name+"\nCaffine: "+this.caffine+" mg "+"\nIt would take "+CafA+" cups of "+this.name+" before it gets dangerous to take.";
	}
}
