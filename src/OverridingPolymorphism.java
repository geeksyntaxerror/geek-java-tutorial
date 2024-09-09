// Superclass
class Animal {
    // Method to be overridden in the subclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog overrides the sound() method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat overrides the sound() method
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class OverridingPolymorphism {

    // Method that accepts any object implementing Animal interface
    public static void makeAnimalSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        // Superclass reference, subclass object
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call method with different implementations
        makeAnimalSound(animal);
        makeAnimalSound(dog); // Output: Dog barks
        makeAnimalSound(cat); // Output: Cat meows
    }
}
