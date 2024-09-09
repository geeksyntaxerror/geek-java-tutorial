// Interface with abstract method
interface Animal1 {
    void sound();  // Abstract method (implicitly public and abstract)
}

// Dog class implements Animal interface
class Dog2 implements Animal1 {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class implements Animal interface
class Cat2 implements Animal1 {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class InterfacePolymorphism {

    // Method that accepts any object implementing Animal interface
    public static void makeAnimalSound(Animal1 animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        // Interface reference, class objects
        Animal1 dog = new Dog2();
        Animal1 cat = new Cat2();

        // Call method with different implementations
        makeAnimalSound(dog); // Output: Dog barks
        makeAnimalSound(cat); // Output: Cat meows
    }
}
