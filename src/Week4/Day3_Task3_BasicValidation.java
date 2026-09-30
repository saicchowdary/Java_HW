package Week4;


public class Day3_Task3_BasicValidation {

    public static void main(String[] args) {

        String expectedText = "Login Successful";
        String actualText = "Login Successful";

        if (expectedText.equals(actualText)) {

            System.out.println("PASS: Text values are matching.");

        } else {

            System.out.println("FAIL: Text values are not matching.");
        }
    }
}
