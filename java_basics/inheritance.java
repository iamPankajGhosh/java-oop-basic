// Parent class (Superclass)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Child class (Subclass)
class Cat extends Animal {
    public Cat(String name) {
        super(name); // Call the constructor of the superclass
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy");

        // Access methods from the superclass
        myDog.eat();
        myDog.sleep();

        // Access methods from the subclass
        myDog.bark();

        // Create an instance of the Cat class
        Cat myCat = new Cat("Whiskers");

        // Access methods from the superclass
        myCat.eat();
        myCat.sleep();

        // Access methods from the subclass
        myCat.meow();
    }
}
