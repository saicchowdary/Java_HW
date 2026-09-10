package Week1;

public class Day2_Task1_IfElse {

    public static void main(String[] args) {

        // Username and Password Check
        String username = "admin";
        String password = "1234";

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        // Age Validation
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // Pass or Fail
        int marks = 75;

        if (marks >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}