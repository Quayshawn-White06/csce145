import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Apple Tester!");
		System.out.println("Creating the first apple class");
		System.out.println("Default values for the first apple");
		Apple a1= new Apple();
		System.out.println(a1.toString());
				 System.out.println(" Please enter the type of the second apple");
		String type=key.nextLine();
		System.out.println("Please enter the weight of the second apple");
		
			double weight = key.nextDouble();
		
			System.out.println("Please enter the price of the second apple ");
			
			double price = key.nextDouble();
			System.out.println("Creating the second apple class");
			System.out.println("The values of the second apple class are");
			Apple a2 = new Apple(type,weight,price);
			System.out.println(a2.toString());
	}

}
