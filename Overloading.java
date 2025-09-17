// A utility class for math operations
class MathUtils {
    // add method for integers
    int add(int a, int b) {
        return a + b;
    }

    // add method for doubles (same name, different parameters)
    double add(double a, double b) {
        return a + b;
    }
}

// Main class to test overloading
public class Overloading {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();

        // Calls the int version (because both arguments are int)
        System.out.println(m.add(2, 3)); // Output: 5

        // Calls the double version (because both arguments are double)
        System.out.println(m.add(2.5, 3.5)); // Output: 6.0
    }
}
