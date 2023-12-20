// Encapsulated class representing a Student
class Student {
    // Private attributes (data)
    private String name;
    private int age;
    private double gpa;

    // Public constructor to initialize the object
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        // Validation for GPA (just for example purposes)
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA. Setting GPA to 0.0");
            this.gpa = 0.0;
        }
    }

    // Public getter methods to access the private attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Public method to display information about the student
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student1 = new Student("John Doe", 20, 3.5);

        // Accessing attributes using public getter methods
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("GPA: " + student1.getGpa());

        // Trying to access private attributes directly (will result in a compilation error)
        // System.out.println("Name: " + student1.name);  // Compilation error

        // Calling a public method to display information
        student1.displayInfo();
    }
}
