package Week1;

public class Day3_Task2_WhileLoop {

    public static void main(String[] args) {

        int attempt = 1;

        while (attempt <= 3) {

            System.out.println("Login Attempt: " + attempt);

            attempt++;
        }

        System.out.println("Login attempts completed.");
    }
}