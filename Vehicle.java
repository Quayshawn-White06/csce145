
public class Vehicle {
    // Instance variables
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor (sets everything to default values)
    public Vehicle() {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 4; // Default to 4 cylinders
        this.ownerName = "Unknown";
    }

    // Parameterized constructor (sets values if valid)
    public Vehicle(String xManufacturerName, int xNumberOfCylinders, String xOwnerName) {
        setManufacturerName(xManufacturerName);
        setNumberOfCylinders(xNumberOfCylinders);
        setOwnerName(xOwnerName);
    }

    // Accessor methods (getters)
    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Mutator methods (setters) with validation
    public void setManufacturerName(String xManufacturerName) {
        if (xManufacturerName != null) {
            this.manufacturerName =xManufacturerName;
        } else {
            this.manufacturerName = "Unknown"; // Default if invalid
        }
    }

    public void setNumberOfCylinders(int  xNumberOfCylinders) {
        if ( xNumberOfCylinders > 0) {
            this.numberOfCylinders =  xNumberOfCylinders;
        } else {
            this.numberOfCylinders = 4; // Default if invalid (minimum cylinders must be 1)
        }
    }

    public void setOwnerName(String xOwnerName) {
        if (ownerName != null) {
            this.ownerName = xOwnerName;
        } else {
            this.ownerName = "Unknown"; // Default if invalid
        }
    }

    // equals method to check if two Vehicle objects are identical
    public boolean equals(Vehicle other) {
        if (other == null) {
            return false;
        }
        return this.manufacturerName.equals(other.manufacturerName) &&
               this.numberOfCylinders == other.numberOfCylinders &&
               this.ownerName.equals(other.ownerName);
    }

    // toString method to return a string representation of the Vehicle object
    @Override
    public String toString() {
        return "Manufacturer: " + manufacturerName + "\n" +
               "Number of Cylinders: " + numberOfCylinders + "\n" +
               "Owner: " + ownerName;
    }
}