
public class Apple {
// setting up our variables
	private String type;
	private double weight;
	private double price;
	
	//default constructor
	public Apple()
	{
		
			this.type="Gala";
			this.weight = .50;
			this.price = .88;
		
	}
	
	//paramiterized constructor
	public Apple(String xType,double xWeight,double xPrice)
	{
		this.setType(xType);
		this.setWeight(xWeight);
		this.setPrice(xPrice);
	}
	
	//accessors=only access
	public String getType()
	{
		return this.type;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	//mutators
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Red Delicious")
				||xType.equalsIgnoreCase("Golden Delicious")
				||xType.equalsIgnoreCase("Gala")
				||xType.equalsIgnoreCase("Granny Smith"))
		{
	this.type=xType;
		}
		else
		{
			System.out.println("Invalid apple type entered.");
		}
	}
	
	public void setWeight(Double xWeight)
	{
		
		this.weight = xWeight;
		
	
	}
	public void setPrice(Double xPrice)
	{
	
		this.price=xPrice;
		
		
	}
	
	public String toString()
	{
		return "Type:"+this.type+"\nWeight:"+this.weight+"kg"+"\nPrice "+"$"+this.price;
				
	}
}
