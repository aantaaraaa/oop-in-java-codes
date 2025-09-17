// Abstract class: cannot be instantiated directly
abstract class Vehicle {
    // Abstract method: no body, subclasses must implement it
    abstract void start();

    // Normal (concrete) method: has a body, subclasses can use it as is
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Subclass Car inherits from Vehicle
class Car extends Vehicle {
    // Car must provide its own version of start()
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

// Main class that runs the program
public class Abstraction {
    public static void main(String[] args) {
        // We cannot create an object of Vehicle directly because it's abstract.
        // Instead, we create a Car object, but refer to it using Vehicle type.
        Vehicle v = new Car();

        // Calls Car's implementation of start()
        v.start(); // Output: Car starts with a key.

        // Calls stop() from Vehicle (since Car didn't override it)
        v.stop();  // Output: Vehicle stopped.
    }
}
