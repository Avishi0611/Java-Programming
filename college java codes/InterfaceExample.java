// Interface declaration
interface Animal {
    void eat();
    void sleep();
}

// Another interface
interface Pet {
    void play();
}

// Class implementing one interface
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    public void sleep() {
        System.out.println("Dog sleeps in kennel.");
    }
}

// Class implementing multiple interfaces
class Cat implements Animal, Pet {
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    public void sleep() {
        System.out.println("Cat sleeps on couch.");
    }

    public void play() {
        System.out.println("Cat plays with a ball.");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("---- Interface Example ----");

        Dog d = new Dog();
        d.eat();
        d.sleep();

        Cat c = new Cat();
        c.eat();
        c.sleep();
        c.play();
    }
}
