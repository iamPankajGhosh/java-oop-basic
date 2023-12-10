package java_basics;
import java.util.Scanner;

public class TrafficLightSimulator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the color of the traffic light (Red, Yellow, Green): ");
		String color = scanner.nextLine().toLowerCase();
		
		switch (color) {
			case "red":
			 System.out.println("Stop!");
			 break;
			 
			case "yellow":
				System.out.println("Prepare to stop or proceed with caution.");
                break;
                
            case "green":
            	System.out.println("Go!");
                break;
                
            default :
            	System.out.println("Invalid color entered. Please enter Red, Yellow, or Green.");
		}
		
		scanner.close();
	}
}
