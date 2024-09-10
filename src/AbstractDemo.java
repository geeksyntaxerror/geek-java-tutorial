// Abstract class
abstract class Animal2 {
    String name;

    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method (with implementation)
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Subclass that extends the abstract class Animal
class Dog1 extends Animal2 {
    // Constructor
    Dog1(String name) {
        this.name = name;
    }

    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}

// Another subclass that extends the abstract class Animal
class Cat1 extends Animal2 {
    // Constructor
    Cat1(String name) {
        this.name = name;
    }

    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println(name + " meows");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Create Dog object
        Animal2 dog = new Dog1("Buddy");
        dog.sound();  // Output: Buddy barks
        dog.sleep();  // Output: Buddy is sleeping...

        // Create Cat object
        Animal2 cat = new Cat1("Whiskers");
        cat.sound();  // Output: Whiskers meows
        cat.sleep();  // Output: Whiskers is sleeping...
    }
}
