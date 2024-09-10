// Defining two interfaces with default methods
interface Walkable {
    default void move() {
        System.out.println("Walking");
    }
}

interface Runnable {
    default void move() {
        System.out.println("Running");
    }
}

// Implementing both interfaces in a class
class Person implements Walkable, Runnable {
    // Resolving the conflict by overriding the move method
    @Override
    public void move() {
        // Optionally choose which interface's default method to use
        Walkable.super.move();  // You could also use Walkable.super.move()
        System.out.println("Moving in a custom way");
    }
}

public class InterfacesDepthDemo {
    public static void main(String[] args) {
        // Creating an instance of Person and calling move
        Person person = new Person();
        person.move();  // This will invoke the overridden move method
    }
}
