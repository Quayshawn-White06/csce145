
public class Truck extends Vehicle {
    // Additional attributes specific to Truck
    private double loadCapacity;   

    private double towingCapacity; 

    // Default constructor
    public Truck() {
        super(); // Call the default constructor of Vehicle
        this.loadCapacity = 0.0;   
        this.towingCapacity = 0.0; 
    }

    // Parameterized constructor: takes values for the vehicle attributes as well as load and towing capacity
    
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName); 
        setLoadCapacity(loadCapacity); 
        setTowingCapacity(towingCapacity); 
    }

    // Accessor methods (getters)
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Mutator methods (setters) with validation
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        } else {
            this.loadCapacity = 0.0; // Default to 0 if invalid
        }
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity >= 0) {
            this.towingCapacity = towingCapacity;
        } else {
            this.towingCapacity = 0.0; // Default to 0 if invalid
        }
    }

    // equals method to check if two Truck objects are identical (including vehicle attributes)
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Truck other = (Truck) obj;
        return super.equals(other) && // Check if vehicle attributes are equal
               this.loadCapacity == other.loadCapacity && 
               this.towingCapacity == other.towingCapacity;
    }

    // toString method to return a string representation of the Truck object
    @Override
    public String toString() {
  
        return super.toString() + "\n" +
               "Load Capacity: " + loadCapacity + " tons\n" +
               "Towing Capacity: " + towingCapacity + " tons";
    }
}