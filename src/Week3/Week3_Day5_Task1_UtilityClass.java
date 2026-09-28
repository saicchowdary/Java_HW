package Week3;


public class Week3_Day5_Task1_UtilityClass {

    // String helper method
    public static String convertToUpperCase(String text) {
        return text.toUpperCase();
    }

    // Validation helper method
    public static boolean validatePassword(String password) {
        return password.length() >= 8;
    }

    // Test result helper method
    public static void printResult(boolean result) {
        if (result) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public static void main(String[] args) {

        String username = "Deep";
        String password = "Testing123";

        System.out.println("Username: " + convertToUpperCase(username));

        boolean result = validatePassword(password);

        printResult(result);
    }
}

