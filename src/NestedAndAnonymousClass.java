// Main Outer class demonstrating all inner class types
class OuterClass {

    private String message = "Hello from Non-static Inner Class!";
    static String staticMessage = "Hello from Static Nested Class!";

    // 1. Non-static Nested Class (Inner Class)
    class InnerClass {
        public void display() {
            System.out.println(message);  // Accessing outer class's private member
        }
    }

    // 2. Static Nested Class
    static class StaticNestedClass {
        void display() {
            System.out.println(staticMessage);  // Accessing outer class's static member
        }
    }

    // Method demonstrating Local Class
    public void demonstrateLocalClass() {
        final String localMessage = "Hello from Local Class!";

        // 3. Local Class (Method-Local Inner Class)
        class LocalClass {
            void display() {
                System.out.println(localMessage);  // Accessing local variable
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.display();  // Calling method of local class
    }

    // Method demonstrating Anonymous Class
    public void demonstrateAnonymousClass() {
        // 4. Anonymous Class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        greeting.sayHello();  // Calling method of anonymous class
    }
}

// Greeting interface to be used by the Anonymous Class
interface Greeting {
    void sayHello();
}

public class NestedAndAnonymousClass {
    public static void main(String[] args) {

        // 1. Non-static Nested Class (Inner Class)
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();  // Output: Hello from Non-static Inner Class!

        // 2. Static Nested Class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();  // Output: Hello from Static Nested Class!

        // 3. Local Class (Method-Local Inner Class)
        outer.demonstrateLocalClass();  // Output: Hello from Local Class!

        // 4. Anonymous Class
        outer.demonstrateAnonymousClass();  // Output: Hello from Anonymous Class!
    }
}
