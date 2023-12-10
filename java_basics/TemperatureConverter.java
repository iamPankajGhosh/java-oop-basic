package java_basics;
import java.util.Scanner;

public class TemperatureConverter {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the temperature: ");
	        double temperature = scanner.nextDouble();

	        System.out.print("Enter the scale (C for Celsius, F for Fahrenheit): ");
	        char scale = scanner.next().charAt(0);

	        double convertedTemperature;

	        switch (scale) {
	            case 'C':
	            case 'c':
	                convertedTemperature = (temperature * 9 / 5) + 32;
	                System.out.println("Temperature in Fahrenheit: " + convertedTemperature + "°F");
	                break;
	                
	            case 'F':
	            case 'f':
	                convertedTemperature = (temperature - 32) * 5 / 9;
	                System.out.println("Temperature in Celsius: " + convertedTemperature + "°C");
	                break;
	                
	            default:
	                System.out.println("Invalid scale entered. Please enter C or F.");
	        }

	        scanner.close();
	    }
}
