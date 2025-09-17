// Parent class
class Shape {
    // Method to draw a shape
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Child class Circle overrides the draw method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Another child class Rectangle overrides the draw method
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Main class to test overriding
public class Overriding {
    public static void main(String[] args) {
        // Parent reference, parent object
        Shape s1 = new Shape();
        s1.draw(); // Output: Drawing a shape.

        // Parent reference, child object (Circle)
        Shape s2 = new Circle();
        s2.draw(); // Output: Drawing a circle.

        // Parent reference, child object (Rectangle)
        Shape s3 = new Rectangle();
        s3.draw(); // Output: Drawing a rectangle.
    }
}
