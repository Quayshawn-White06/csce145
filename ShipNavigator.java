import java.util.Scanner;
public class ShipNavigator {
//quayshawn white
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String input="";
		do
		{
		System.out.println("Welcome to ship navigator enter the name of the ship.");
		
		String name =key.nextLine();
		
		System.out.println("Enter its launch date (mm/dd/yyyy):");
		
		String LaunchDate=key.nextLine();
		
		System.out.println("Is this a cruise or a cargo ship.");
		String ship=key.nextLine();
		
		if(ship.equalsIgnoreCase("cruise ship"))
		{
			
			
			System.out.println("Enter the ship's passenger capacity:");
			int PassengerCapacity=key.nextInt();
			
			System.out.println("Enter the crew members on the ship");
			int CrewMembers = key.nextInt();
			
			System.out.println("Creating the ship object");
			CruiseShip c1= new CruiseShip(name,LaunchDate,PassengerCapacity,CrewMembers);
			System.out.println(c1);
		}
		else if(ship.equalsIgnoreCase("cargo ship"))
		{
			System.out.println("Enter the tonnage:");
			Double tonnage=key.nextDouble();
			
			System.out.println("Enter the maximum speed");
			Double MaximumSpeed=key.nextDouble();
			
			CargoShip c1=new CargoShip(name,LaunchDate,tonnage,MaximumSpeed);
			System.out.print(c1);
		}
		else
		{
			System.out.println("invalid type input");
		}
		System.out.println("Would you like to create more classes(Please enter yes or no)");
		input=key.nextLine();
	}while(input.equalsIgnoreCase("yes"));
	}
	
}
