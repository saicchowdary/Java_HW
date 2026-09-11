package Week1;

public class Day4_Task3_ReturnTypes {

    // Returns boolean
    public static boolean isLoginSuccessful() {
        return true;
    }

    // Returns int
    public static int getTestCount() {
        return 10;
    }

    // Returns String
    public static String getBrowserName() {
        return "Chrome";
    }

    public static void main(String[] args) {

        boolean loginResult = isLoginSuccessful();
        int testCount = getTestCount();
        String browser = getBrowserName();

        System.out.println("Login Successful: " + loginResult);
        System.out.println("Total Tests: " + testCount);
        System.out.println("Browser: " + browser);
    }
}
