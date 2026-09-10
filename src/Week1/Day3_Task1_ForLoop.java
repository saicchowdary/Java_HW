package Week1;

public class Day3_Task1_ForLoop {

    public static void main(String[] args) {

        // Print 1 to 10
        System.out.println("Numbers 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Even Numbers
        System.out.println("Even Numbers:");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Multiplication Table
        System.out.println("Table of 5:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Reverse
        System.out.println("Reverse:");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}