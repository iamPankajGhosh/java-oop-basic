# Java and Object-Oriented Programming (OOP):

## Set Up Your Development Environment:

- Download and install the Java Development Kit (JDK) from the official Oracle website

- Choose an Integrated Development Environment (IDE) such as Eclipse or Visual Studio Code for a smoother coding experience.

## Learn Java Basics:

- Familiarize yourself with basic Java syntax, data types, variables, and control structures (if statements, loops).

- Understand how to work with classes and methods.

## Introduction to Object-Oriented Programming (OOP):

- Learn the four main principles of OOP: Encapsulation, Inheritance, Abstraction, and Polymorphism.

- Understand the concept of classes and objects.

## Your First Java Program:

Let's start with a simple "Hello, World!" program, which is often the first program you write in any programming language:

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- ### public class HelloWorld: 

     This line declares a class named HelloWorld. In Java, every application consists of at least one class.

- ### public static void main(String[] args):

    This is the main method where the program starts executing. It's the entry point of a Java application.

- ### System.out.println("Hello, World!");: 

    This line prints "Hello, World!" to the console.

## Variables and Data Types:

Java is a statically-typed language, meaning you need to declare the type of a variable before using it.

```
int age = 25;       // Integer
double salary = 1000.50;  // Double
char grade = 'A';   // Character
boolean isStudent = true;  // Boolean
String name = "John";  // String
```

## Control Flow:

- ### Conditional Statements (if-else):

    ```
    int number = 10;

    if (number > 0) {
        System.out.println("Positive");
    } else if (number < 0) {
        System.out.println("Negative");
    } else {
        System.out.println("Zero");
    }
    ```

- ### Loops (for, while, do-while):

    ```
    // For loop
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }

    // While loop
    int counter = 0;
    while (counter < 5) {
        System.out.println(counter);
        counter++;
    }

    // Do-while loop
    int x = 0;
    do {
        System.out.println(x);
        x++;
    } while (x < 5);
    ```

## Functions (Methods):

    ```
    // Method definition
    int add(int a, int b) {
        return a + b;
    }

    // Method invocation
    int result = add(5, 3);
    System.out.println(result);

    // Output: 8
    ```

##  Arrays:

```
int[] numbers = {1, 2, 3, 4, 5};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

##  Classes and Objects:

In Java, everything is associated with classes and objects. A class is a blueprint for objects, and an object is an instance of a class. Here's a simple example:

```
// Define a class
class Car {
    // Fields (attributes)
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println("The car is starting.");
    }
}

// Create an object
Car myCar = new Car("Toyota", "Camry", 2022);

// Access fields and call methods
System.out.println("My car is a " + myCar.year + " " + myCar.brand + " " + myCar.model);
myCar.start();
```

## Encapsulation:

Encapsulation is the bundling of data and methods that operate on that data within a single unit, i.e., a class. It helps in data hiding and protecting the integrity of the data.

```
class Person {
    private String name;  // private field

    public Person(String name) {
        this.name = name;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

Person person = new Person("John");
System.out.println("Person's name: " + person.getName());
person.setName("Jane");
System.out.println("Updated name: " + person.getName());
```

## Inheritance:

Inheritance allows a class to inherit properties and methods from another class. The class that is inherited is called the superclass, and the class that inherits is called the subclass.

```
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

// Create an object of the subclass
Dog myDog = new Dog();
myDog.eat();  // Inherited method
myDog.bark(); // Subclass-specific method
```

## Polymorphism:

Polymorphism allows objects of different classes to be treated as objects of a common superclass. There are two types of polymorphism in Java: compile-time (method overloading) and runtime (method overriding).

```
// Compile-time polymorphism (method overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

Calculator calc = new Calculator();
System.out.println(calc.add(5, 10));       // Calls the first method
System.out.println(calc.add(3.5, 7.2));   // Calls the second method
```

```
// Runtime polymorphism (method overriding)
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

Shape myShape = new Circle();  // Reference of superclass, object of subclass
myShape.draw();  // Calls the overridden method in Circle class
```

## Abstraction:

Abstraction is the process of hiding the implementation details and showing only the functionality. In Java, abstraction can be achieved through abstract classes and interfaces.

```
// Abstract class
abstract class Shape {
    abstract void draw();
}

// Concrete subclass
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Create an object of the subclass
Shape myShape = new Circle();
myShape.draw();  // Calls the overridden method in Circle class
```

These are the basic concepts of OOP in Java. 