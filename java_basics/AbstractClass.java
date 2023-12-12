package java_basics;

abstract class AbstractClass {
	// abstract method
	abstract double calculateArea();
	
	// concrete method
	void display() {
		System.out.println("This is abstract class");
	}
}

// concrete subclass
class Circle extends AbstractClass {
	double radius;
	
	// constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	// Implement by abstract method
	double calculateArea() {
		return Math.PI* radius* radius;
	}
}

package java_basics;

public class AbstractClassExample{
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		
		// calling methods
		circle.display();
		double area = circle.calculateArea();
		System.out.println("Area of the circle : " + area);
	}
}
