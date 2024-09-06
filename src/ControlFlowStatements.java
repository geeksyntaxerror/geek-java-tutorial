public class ControlFlowStatements {

    // Method to demonstrate return statement
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // 1. if-else statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }

        // 2. switch-case statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 3. for loop
        System.out.println("For loop example:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // 4. while loop
        System.out.println("While loop example:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 5. do-while loop
        System.out.println("Do-while loop example:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        // 6. break and continue
        System.out.println("Break and continue example:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // Break the loop when i equals 5
            }
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }

        // 7. return statement
        int a = 3, b = 7;
        int sum = add(a, b); // Call method to add two numbers
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}
