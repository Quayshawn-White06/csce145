import java.util.Scanner;
public class CoffeeTester {
//quayshawn white
	public static void main(String[] args) {
		String input="";
		Scanner key = new Scanner(System.in);
		do {
		System.out.println("Please enter the name of your coffee");
		
		String name = key.nextLine();
		
		System.out.println("Please enter the amount of caffine");
		
		double caffine = key.nextDouble();
		while(caffine<50)
		{
			System.out.println("Please enter a proper amount of caffine");
			 caffine = key.nextDouble();
			
		}
		
		while(caffine>300)
		{
			System.out.println("Please enter a proper amount of caffine");
			 caffine = key.nextDouble();
			
		}
		
		double CafA= 180.0/((caffine / 100.0)*6.0);
		Coffee c1=new Coffee(name,caffine,CafA);
		System.out.println(c1.toString());
		//clears the line left by double
		key.nextLine(); 
		
		System.out.println("Please enter the name of your second coffee");
		
		  name = key.nextLine();
		 
		 System.out.println("Please enter the amount of caffine");
			
			  caffine= key.nextDouble();
			while(caffine<50)
			{
				System.out.println("Please enter a proper amount of caffine");
				 caffine = key.nextDouble();
				
			}
			
			while(caffine>300)
			{
				System.out.println("Please enter a proper amount of caffine");
				 caffine = key.nextDouble();
				
			}
			
			 CafA= 180.0/((caffine / 100.0)*6.0);
			 
			 Coffee c2=new Coffee(name,caffine,CafA);
			 
				System.out.println(c2.toString());
				
				key.nextLine();
				//calls the boolean made earlier
				System.out.println("Are the two coffees the same? "+c1.equals(c2));
				
				System.out.println("Would you like to make more classes(Please enter Yes or No)");
				 input=key.nextLine();
		}while(input.equalsIgnoreCase("Yes"));
	}

}
