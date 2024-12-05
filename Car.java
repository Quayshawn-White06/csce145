public class Car extends Vehicle {
    
    private double gasMileage;     
    private int numberOfPassengers; // Number of passengers (non-negative)

    // Default constructor
    public Car() {
        super(); // Call the default constructor of Vehicle
        this.gasMileage = 25.0;    // Default gas mileage is 25 miles per gallon
        this.numberOfPassengers = 5; // Default number of passengers is 5
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName); 
        setGasMileage(gasMileage); 
        setNumberOfPassengers(numberOfPassengers); 
    }

    // Accessor methods (getters)
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Mutator methods (setters) with validation
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            this.gasMileage = 25.0; // Default to 25 mpg if invalid
        }
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            this.numberOfPassengers = 5; // Default to 5 passengers if invalid
        }
    }

    // equals method to check if two Car objects are identical (including vehicle attributes)
   
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car other = (Car) obj;
        return super.equals(other) && // Check if vehicle attributes are equal
               this.gasMileage == other.gasMileage && 
               this.numberOfPassengers == other.numberOfPassengers;
    }

    // toString method to return a string representation of the Car object
    
    public String toString() {
        // Call the Vehicle's toString method and append Car-specific information
        return super.toString() + "\n" +
               "Gas Mileage: " + gasMileage + " mpg\n" +
               "Number of Passengers: " + numberOfPassengers;
    }
}
