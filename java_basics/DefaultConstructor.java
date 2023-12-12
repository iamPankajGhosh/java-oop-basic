package java_basics;

public class DefaultConstructor {
	private String model;
	private int year;
	
	// Default constructor
	public void Car() {
		this.model = "Unknown";
		this.year = 0;
	}
	
	public void displayDetails() {
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
	}
	
	public static void main(String[] args){
		DefaultConstructor myCar = new DefaultConstructor();
		myCar.displayDetails();
	}
}
