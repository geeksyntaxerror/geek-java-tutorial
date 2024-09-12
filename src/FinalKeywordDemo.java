// Final class: This class cannot be extended
final class FinalClass {
    // Final instance variable
    final int instanceVar;

    // Final static variable (constant)
    final static int STATIC_VAR = 100;

    // Constructor to initialize the final instance variable
    public FinalClass(int value) {
        this.instanceVar = value; // Initialize the final variable in the constructor
    }

    // Final method: This method cannot be overridden
    public final void showFinalMethod() {
        System.out.println("This is a final method inside a final class.");
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable (Constant): " + STATIC_VAR);
    }
}

// Uncommenting this class will cause a compile-time error because FinalClass cannot be extended
// class ChildClass extends FinalClass { }

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Create an object of FinalClass
        FinalClass finalObj = new FinalClass(50);

        // Display the values of the final variables
        finalObj.displayValues();

        // Call the final method
        finalObj.showFinalMethod();

        // Uncommenting the below line will cause a compile-time error
        //finalObj.instanceVar = 200;  // Error: cannot assign a value to final variable

        // Uncommenting the below line will also cause a compile-time error
        // FinalClass.STATIC_VAR = 200;  // Error: cannot assign a value to final static variable
    }
}
