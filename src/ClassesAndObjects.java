// Class definition
class Car1 {
    // Fields (Attributes)
    String model;
    int year;
    String color;

    //Default Constructor
    Car1(){}

    //Parameterized Constructor
    Car1(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method (Behavior)
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Color : " + color);
    }
}

// Main class to create and use objects
public class ClassesAndObjects {
    public static void main(String[] args) {
        // Object creation
        Car1 myCar = new Car1();
        Car1 anotherCar = new Car1("Honda Civic", 2021, "Blue");

        // Accessing methods
        myCar.displayDetails();
        System.out.println(); // For readability
        anotherCar.displayDetails();
    }
}
