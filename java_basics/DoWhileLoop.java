import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            // Display menu
            System.out.println("1. Print Hello");
            System.out.println("2. Print World");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            // Read user input
            userChoice = scanner.nextInt();

            // Perform actions based on user input
            switch (userChoice) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("World");
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

        } while (userChoice != 3); // Continue looping until the user chooses to exit (enter 3)

        // Close the scanner
        scanner.close();
    }
}
