package java_basics;

public class ParameterizedConstructor {
	private String name;
	private int age;

	// parameterized constructor
	public ParameterizedConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
	public static void main(String[] agrs) {
		ParameterizedConstructor student = new ParameterizedConstructor("john", 18);
		student.displayInfo();
		
		// create another student
		ParameterizedConstructor student1 = new ParameterizedConstructor("jane", 22);
		student1.displayInfo();
		
	}
}
