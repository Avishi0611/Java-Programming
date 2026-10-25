//Compile-time Polymorphism (Method Overloading)

class MathOperation {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Run-time Polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismTypes {
    public static void main(String[] args) {
        System.out.println("---- Compile-time Polymorphism ----");
        MathOperation m = new MathOperation();
        System.out.println("Sum of 2 integers: " + m.add(5, 10));
        System.out.println("Sum of 3 integers: " + m.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + m.add(5.5, 4.5));

        System.out.println("\n---- Run-time Polymorphism ----");
        Animal a;

        a = new Dog();  // reference of parent, object of child
        a.sound();

        a = new Cat();  // reference of parent, object of child
        a.sound();
    }
}
