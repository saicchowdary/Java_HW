package Week2;


public class Day1_Task2_ArrayTraversal {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 5, 40, 15};

        int sum = 0;
        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers) {

            System.out.println(number);

            sum = sum + number;

            if (number > maximum) {
                maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
    }
}

