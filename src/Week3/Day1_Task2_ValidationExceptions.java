package Week3;


public class Day1_Task2_ValidationExceptions {

    public static void main(String[] args) {

        String username = "";

        try {

            if (username.isEmpty()) {
                throw new Exception("Username cannot be empty.");
            }

            System.out.println("Valid Username: " + username);

        } catch (Exception e) {

            System.out.println("Validation Error: " + e.getMessage());
        }

        System.out.println("Validation completed.");
    }
}