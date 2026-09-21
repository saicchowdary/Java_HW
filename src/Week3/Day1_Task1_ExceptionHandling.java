package Week3;


public class Day1_Task1_ExceptionHandling {

    public static void main(String[] args) {

        // Example 1: Divide by Zero
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");
        }


        // Example 2: Invalid Array Index
        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index.");
        }

        System.out.println("Program completed successfully.");
    }
}