public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Example 1: Multiple catch blocks for different exceptions
        try {
            int[] numbers = {1, 2, 3};

            // Attempting to access an invalid array index
            System.out.println("Accessing invalid array index: " + numbers[3]);  // ArrayIndexOutOfBoundsException

            // Attempting to divide by zero
            int result = 10 / 0;  // ArithmeticException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("First try-catch block complete.\n");
        }

        // Example 2: Using a single catch block to handle multiple exceptions
        try {
            String text = null;

            // Attempting to trigger a NullPointerException
            System.out.println("String length: " + text.length());  // NullPointerException

            // Attempting to perform division by zero
            int result = 10 / 0;  // ArithmeticException

        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Second try-catch block complete.\n");
        }

        // Example 3: Custom exception handling
        try {
            checkAge(18);  // Throws CustomException if age < 18

        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());

        } finally {
            System.out.println("Third try-catch block complete.\n");
        }
    }

    // Method to demonstrate custom exception
    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
