import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number % 2 == 0) {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is odd.");
        }
    }
}
