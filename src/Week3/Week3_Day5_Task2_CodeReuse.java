package Week3;


public class Week3_Day5_Task2_CodeReuse {

    public static void main(String[] args) {

        String username = "Deep";
        String password = "Testing123";

        // Reuse String helper method
        String upperName =
                Week3_Day5_Task1_UtilityClass.convertToUpperCase(username);

        System.out.println("Username: " + upperName);

        // Reuse password validation method
        boolean passwordResult =
                Week3_Day5_Task1_UtilityClass.validatePassword(password);

        // Reuse test result method
        Week3_Day5_Task1_UtilityClass.printResult(passwordResult);
    }
}
