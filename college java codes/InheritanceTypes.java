//Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

//Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps softly.");
    }
}

//Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}



public class InheritanceTypes{
    public static void main(String[] args) {
        System.out.println("---- Single Inheritance ----");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n---- Multilevel Inheritance ----");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\n---- Hierarchical Inheritance ----");
        Cat c = new Cat();
        c.eat();
        c.meow();

    }
}
