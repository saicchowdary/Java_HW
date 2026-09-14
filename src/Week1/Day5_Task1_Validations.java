package Week1;

public class Day5_Task1_Validations {

    public static void main(String[] args) {

        // 1. Password Length Validation
        String password = "Java1234";

        if (password.length() >= 8) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password must contain at least 8 characters");
        }


        // 2. Age Eligibility Validation
        int age = 22;

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }


        // 3. Pass or Fail Validation
        int marks = 75;

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
