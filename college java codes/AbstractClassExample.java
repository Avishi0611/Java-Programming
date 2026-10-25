// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete (non-abstract) method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        // We cannot create an object of an abstract class
        // Shape s = new Shape(); // This would cause an error

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("---- Abstract Class Example ----");
        s1.display();
        s1.draw();

        s2.display();
        s2.draw();
    }
}
