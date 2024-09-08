class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method to multiply a double and an integer
    public double multiply(double a, int b) {
        return a * b;
    }

    // Overloaded method to multiply two double values
    public double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing overloaded add methods
        System.out.println("Add (int, int): " + calc.add(5, 10));                 // Output: 15
        System.out.println("Add (int, int, int): " + calc.add(5, 10, 15));        // Output: 30
        System.out.println("Add (double, double): " + calc.add(5.5, 10.2));       // Output: 15.7

        // Testing overloaded multiply methods
        System.out.println("Multiply (int, int): " + calc.multiply(5, 10));       // Output: 50
        System.out.println("Multiply (double, int): " + calc.multiply(5.5, 10));  // Output: 55.0
        System.out.println("Multiply (double, double): " + calc.multiply(5.5, 2.5));  // Output: 13.75
    }
}
