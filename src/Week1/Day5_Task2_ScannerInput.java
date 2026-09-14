package Week1;

import java.util.Scanner;

public class Day5_Task2_ScannerInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Username Input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Password Input
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Age Input
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("\nValidation Results:");

        // Username Validation
        if (username.length() >= 3) {
            System.out.println("Username is valid");
        } else {
            System.out.println("Username is invalid");
        }

        // Password Validation
        if (password.length() >= 8) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }

        // Age Validation
        if (age >= 18) {
            System.out.println("User is eligible");
        } else {
            System.out.println("User is not eligible");
        }

        scanner.close();
    }
}
