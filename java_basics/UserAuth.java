package java_basics;
import java.util.Scanner;

public class UserAuth {
	public static void main(String[] args){
		System.out.println("              Sign Up");
		System.out.println("_______________________________________");
		System.out.print("Enter a user name : ");
		
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		
		System.out.print("Enter a user password : ");
		String userPassword = scanner.next();
		
		System.out.println("User name is "+userName+" and password is "+userPassword);
		
		System.out.println("               Log In");
		System.out.println("_______________________________________");
		
		System.out.print("Enter a user name : ");
		String inputUserName = scanner.next();
		
		System.out.print("Enter a user password : ");
		String inputUserPassword = scanner.next();
		
		scanner.close();
		
		if(userName.equals(inputUserName) && userPassword.equals(inputUserPassword)) {
			System.out.print("Log in success");
		}
		else {
			System.out.print("Log in unsuccess");
		}
	}
}
