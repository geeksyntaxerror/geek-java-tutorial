import static java.lang.Math.*;  // Static import for Math class methods

class CombinedExample {
    // Static variable
    static int staticVar = 0;
    // Instance variable
    int instanceVar = 0;

    // Static block to initialize static variables
    static {
        System.out.println("Static block executed.");
        staticVar = 100;
    }

    // Instance method to modify both static and instance variables
    void increment() {
        staticVar++;
        instanceVar++;
    }

    // Static method to display static variable
    static void displayStaticVar() {
        System.out.println("Static variable: " + staticVar);
    }

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        // Static block executes automatically when the class is loaded
        System.out.println("Initial static variable: " + CombinedExample.staticVar);

        // Creating two objects of CombinedExample class
        CombinedExample obj1 = new CombinedExample();
        CombinedExample obj2 = new CombinedExample();

        // Increment static and instance variables for both objects
        obj1.increment();


        // Display static and instance variables for obj1
        System.out.println("obj1 - staticVar: " + obj1.staticVar + ", instanceVar: " + obj1.instanceVar);
        // Display static and instance variables for obj2
        obj2.increment();
        System.out.println("obj2 - staticVar: " + obj2.staticVar + ", instanceVar: " + obj2.instanceVar);

        // Calling the static method
        CombinedExample.displayStaticVar();

        // Using static import for Math class
        System.out.println("Square root of 16: " + sqrt(16));  // Using sqrt from Math class
        System.out.println("Value of PI: " + PI);  // Using PI from Math class

        // Instantiating and using static nested class
        CombinedExample.StaticNestedClass nestedObj = new CombinedExample.StaticNestedClass();
        nestedObj.display();  // Output: Inside static nested class
    }
}
