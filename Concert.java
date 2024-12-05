
public class Concert {

	private String BandName;
	private int capacity;
	private int ticketsBP;
	private int ticketsAV;
	private double PriceByPhone;
	private double priceAV;
	
	
	//default constructor
	public Concert()
	{
		this.BandName="Unknown";
		this.capacity = 0;
		this.ticketsBP = 0;
		this.ticketsAV = 0;
		this.PriceByPhone = 0;
		this.priceAV = 0;
	}
	//parameterized constructors
	public Concert (String xBandName, int xCapacity, double xPriceByPhone, double xPriceAV)
	{
		this.setBandName(xBandName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceAV);
	}
	
	public Concert (String xBandName, int xCapacity, int xTicketsBP, int xTicketsAV)
	{
		this.setBandName(xBandName);
		this.setCapacity(xCapacity);
		this.setticketsBP(xTicketsBP);
		this.setticketsAV(xTicketsAV);
	}
	
	//accessors
	public String getBandName()
	{
		return this.BandName;
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public int getNumTicketsSoldByPhone()
	{
		return this.ticketsBP;
	}
	
	public int getNumTicketsSoldAtVenue()
	{
		return this.ticketsAV;
	}
	
	public double getPriceByPhone()
	{
		return this.PriceByPhone;
	}
	
	public double getPriceAV()
	{
		return this.priceAV;
	}
	
	//mutators
	public void setBandName(String xBandName)
	{
		this.BandName=xBandName;
	}
	
	public void setCapacity(int xCapacity)
	{
		this.capacity=xCapacity;
	}
	
	public void setticketsBP(int xTicketsBP)
	{
		this.ticketsBP = xTicketsBP;
	}
	
	public void setticketsAV(int xTicketsAV)
	{
		this.ticketsAV = xTicketsAV;
	}
	
	public void setPriceByPhone(double xPriceBP)
	{
		this.PriceByPhone=xPriceBP;
	}
	
	public void setPriceAtVenue(double xPriceAV)
	{
		this.priceAV = xPriceAV;
	}
	
	public int totalNumberOfTicketsSold()
	{
		return ticketsBP+ticketsAV;
	}
	
	public int ticketsRemaining()
	{
		return capacity-totalNumberOfTicketsSold();
	}
	//had to be made void so that i will not require a return
	public void buyTicketsByPhone(int numberOfTickets)
	{
		ticketsBP+=numberOfTickets;
	}
	public void buyTicketsAtVenue(int numberOfTicketsBought)
	{
		ticketsAV+=numberOfTicketsBought;
	}
	
	public double totalSales()
	{
		return (ticketsAV*priceAV)+(ticketsBP*priceAV);
	}
	
	
}
