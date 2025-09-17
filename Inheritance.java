// Parent class (also called base or super class)
class Animal {
    // Method that all animals can do
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (also called derived or subclass)
// Dog automatically inherits all methods from Animal
class Dog extends Animal {
    // Method specific to Dog only
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to run the program
public class Inheritance {
    public static void main(String[] args) {
        // Create an object of Dog
        Dog d = new Dog();

        // Call method from parent class Animal (inherited)
        d.eat();   // Output: This animal eats food.

        // Call method from Dog class
        d.bark();  // Output: The dog barks.
    }
}
