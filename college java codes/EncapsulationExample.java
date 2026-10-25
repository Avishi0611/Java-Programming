// Program: Demonstrate Encapsulation in Java

class Student {
    // Private data members (data hiding)
    private String name;
    private int age;
    private int rollNo;

    // Public setter methods (to set data)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Public getter methods (to access data)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        System.out.println("---- Encapsulation Example ----");

        // Create object of Student class
        Student s = new Student();

        // Set data using setter methods
        s.setName("Avishi");
        s.setAge(20);
        s.setRollNo(101);

        // Access data using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Roll Number: " + s.getRollNo());
    }
}
