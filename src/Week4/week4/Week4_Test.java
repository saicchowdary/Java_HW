package Week4.week4;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Week4_Test {

    public static void main(String[] args) {

        // ===== 1. COLLECTIONS =====
        ArrayList<String> browsers = new ArrayList<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        System.out.println("Browser List:");

        for (String browser : browsers) {
            System.out.println(browser);
        }


        // ===== 2. EXCEPTION HANDLING =====
        try {
            int number = 10 / 0;
            System.out.println(number);

        } catch (ArithmeticException e) {
            System.out.println("Exception handled: Cannot divide by zero");
        }


        // ===== 3. FILE HANDLING =====
        try {
            FileWriter writer = new FileWriter("testresult.txt");

            writer.write("Weekly Test 4 Completed Successfully");
            writer.close();

            System.out.println("Data written to file successfully");

        } catch (IOException e) {
            System.out.println("Error while writing to file");
        }
    }
}