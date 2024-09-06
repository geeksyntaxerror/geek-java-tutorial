public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 5;
        System.out.println("c = " + c);            // Assign
        c += 3;
        System.out.println("c += 3: " + c);        // Add and assign
        c -= 2;
        System.out.println("c -= 2: " + c);        // Subtract and assign
        c *= 2;
        System.out.println("c *= 2: " + c);        // Multiply and assign
        c /= 2;
        System.out.println("c /= 2: " + c);        // Divide and assign
        c %= 3;
        System.out.println("c %= 3: " + c);        // Modulus and assign

        // 5. Unary Operators
        int d = 7;
        System.out.println("\nUnary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d: " + (++d));       // Pre-increment
        System.out.println("--d: " + (--d));       // Pre-decrement
        System.out.println("-d: " + (-d));         // Unary minus

        // 6. Bitwise Operators
        int e = 5, f = 2;
        System.out.println("\nBitwise Operators:");
        System.out.println("e & f: " + (e & f));   // Bitwise AND
        System.out.println("e | f: " + (e | f));   // Bitwise OR
        System.out.println("e ^ f: " + (e ^ f));   // Bitwise XOR
        System.out.println("~e: " + (~e));         // Bitwise NOT
        System.out.println("e << 1: " + (e << 1)); // Left shift
        System.out.println("e >> 1: " + (e >> 1)); // Right shift
        System.out.println("e >>> 1: " + (e >>> 1));// Unsigned right shift

        // 7. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + max);

        // 8. instanceof Operator
        String str = "Hello";
        System.out.println("\ninstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));

        // 9. Type Cast Operators
        double g = 7.5;
        int h = (int) g;  // Type casting double to int
        System.out.println("\nType Cast Operator:");
        System.out.println("Casting double g (7.5) to int: " + h);
    }
}
