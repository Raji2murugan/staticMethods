package staticassignment;

import java.util.Scanner;

/**
 * 1. Write a java program to mimic login of a person (Get user name and password from the user and authenticate). The username and password should be hardcoded in a static block.
 */
public class CheckVarify {

	private static String hardcodedUsername;
	private static String hardcodedPassword;

	static {
		hardcodedUsername = "user123";
		hardcodedPassword = "pass123";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username:");
		String username = scanner.nextLine();

		System.out.println("Enter password:");
		String password = scanner.nextLine();

		if (hardcodedUsername.equals(username) && hardcodedPassword.equals(password))
			System.out.println("Login successful!");
		else
			System.out.println("Login failed! Invalid username or password.");

	}

}
