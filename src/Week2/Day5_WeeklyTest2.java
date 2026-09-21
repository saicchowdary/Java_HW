package Week2;



public class Day5_WeeklyTest2 {

    public static void main(String[] args) {

        // 1. Condition - Login Validation
        String username = "admin";

        if (username.equals("admin")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        // 2. Loop - Run Test Cases
        for (int i = 1; i <= 3; i++) {
            System.out.println("Running Test Case: " + i);
        }

        // 3. Method - Test Result
        checkResult(200, 200);
    }

    static void checkResult(int expected, int actual) {

        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}