public class Vehicle {

    // Data Members
    private String brand;
    protected int speed;
    String fuelType;

    // Default Constructor
    Vehicle() {
        brand = "Honda";
        speed = 80;
        fuelType = "Petrol";
    }

    // Parameterized Constructor
    Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Method to assign values
    public void setDetails(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand     : " + brand);
        System.out.println("Speed     : " + speed);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println();
    }

    public static void main(String[] args) {

        // Object using Default Constructor
        Vehicle v1 = new Vehicle();
        System.out.println("Vehicle 1 Details:");
        v1.displayDetails();

        // Object using Parameterized Constructor
        Vehicle v2 = new Vehicle("Toyota", 120, "Diesel");
        System.out.println("Vehicle 2 Details:");
        v2.displayDetails();

        // Using setDetails()
        v2.setDetails("BMW", 180, "Petrol");
        System.out.println("After setDetails():");
        v2.displayDetails();
    }
}
