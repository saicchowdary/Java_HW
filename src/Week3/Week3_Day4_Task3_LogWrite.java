package Week3;

import java.io.FileWriter;
import java.io.IOException;

public class Week3_Day4_Task3_LogWrite {

    public static void main(String[] args) {

        String testName = "Login Test";
        String status = "PASSED";

        try {

            FileWriter logWriter =
                    new FileWriter("execution_log.txt");

            logWriter.write("Test Name: " + testName + "\n");
            logWriter.write("Test Status: " + status + "\n");
            logWriter.write("Execution completed successfully.");

            logWriter.close();

            System.out.println("Execution log created successfully.");

        } catch (IOException e) {

            System.out.println("Unable to create log file.");
        }
    }
}