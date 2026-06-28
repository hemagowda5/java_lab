class Vehicle {

    void start() {
        System.out.println("Vehicle is Starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Starts with Key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike Starts with Self Start");
    }
}

public class VehicleOverride {

    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
    }
}
