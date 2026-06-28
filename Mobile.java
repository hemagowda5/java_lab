public class Mobile {

    String brand;
    String model;
    double price;

    // Constructor with all details
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Constructor with default price
    Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 10000;
    }

    // Display Method
    void displayMobile() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", "S25", 85000);

        Mobile m2 = new Mobile("Realme", "Narzo");

        System.out.println("Mobile 1:");
        m1.displayMobile();

        System.out.println("Mobile 2:");
        m2.displayMobile();
    }
}
