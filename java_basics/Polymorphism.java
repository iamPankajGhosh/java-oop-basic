class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded version of the add method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles (overloaded version of the add method)
    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));           // Calls the first add method
        System.out.println(calculator.add(2, 3, 4));        // Calls the second add method
        System.out.println(calculator.add(2.5, 3.5));       // Calls the third add method
    }
}