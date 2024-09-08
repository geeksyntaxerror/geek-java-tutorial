// Superclass
class Vehicle {
    int speed;
    int fuelCapacity;

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Subclass 1
class Car extends Vehicle {
    boolean hasAirConditioning;

    void turnOnAirConditioning() {
        System.out.println("Air conditioning is on");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    boolean hasSideCar;

    void doWheelie() {
        System.out.println("Motorcycle is doing a wheelie");
    }
}

// Main method to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Inherited from Vehicle
        car.turnOnAirConditioning(); // Car-specific method
        car.stop();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start(); // Inherited from Vehicle
        motorcycle.doWheelie(); // Motorcycle-specific method
        motorcycle.stop();
    }
}
