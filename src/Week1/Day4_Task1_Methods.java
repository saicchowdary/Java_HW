package Week1;

public class Day4_Task1_Methods {

    // Method for sum
    public static void sum() {
        int a = 10;
        int b = 20;
        System.out.println("Sum: " + (a + b));
    }

    // Method for validation
    public static void validateLogin() {
        boolean loginSuccessful = true;

        if (loginSuccessful) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }
    }

    // Method for browser message
    public static void browserMessage() {
        System.out.println("Chrome Browser Launched");
    }

    // Method for test result
    public static void checkTestResult() {
        boolean testPassed = true;

        if (testPassed) {
            System.out.println("Test Case: PASS");
        } else {
            System.out.println("Test Case: FAIL");
        }
    }

    public static void main(String[] args) {

        sum();
        validateLogin();
        browserMessage();
        checkTestResult();
    }
}