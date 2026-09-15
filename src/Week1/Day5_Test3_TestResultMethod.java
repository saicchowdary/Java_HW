package Week1;

public class Day5_Test3_TestResultMethod {

    public static void main(String[] args) {

        checkTestResult(true);
    }

    public static void checkTestResult(boolean result) {

        if (result) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}