package java_basics;

public class ConstructorOverloading {
	private int length;
	private int width;

	// Default constructor
	public ConstructorOverloading() {
		this.length = 0;
		this.width = 0;
	}
	
	// Parameterized constructor
	public ConstructorOverloading(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void displayDimensions() {
		System.out.println("Length : " + length);
		System.out.println("Width : " + width);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading rectangle = new ConstructorOverloading();
		rectangle.displayDimensions();
		
		ConstructorOverloading rectangle2 = new ConstructorOverloading(5,2);
		rectangle2.displayDimensions();
	}
}
