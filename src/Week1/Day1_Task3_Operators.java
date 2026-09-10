package Week1;

public class Day1_Task3_Operators {

    public static void main(String[] args) {

        // Arithmetic Operator
        int manualTests = 20;
        int automationTests = 30;

        int totalTests = manualTests + automationTests;

        System.out.println("Total Tests: " + totalTests);


        // Relational Operator - Age Check
        int age = 25;

        boolean ageEligible = age >= 18;

        System.out.println("Age Eligible: " + ageEligible);


        // Marks Calculation
        int javaMarks = 80;
        int seleniumMarks = 90;

        int totalMarks = javaMarks + seleniumMarks;

        System.out.println("Total Marks: " + totalMarks);


        // Logical Operator - Login Eligibility
        boolean correctUsername = true;
        boolean correctPassword = true;

        boolean loginSuccessful =
                correctUsername && correctPassword;

        System.out.println("Login Successful: " + loginSuccessful);
    }
}