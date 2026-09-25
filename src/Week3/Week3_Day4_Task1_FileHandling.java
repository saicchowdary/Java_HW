package Week3;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Week3_Day4_Task1_FileHandling {

    public static void main(String[] args) {

        try {
            // Write data into a file
            FileWriter writer = new FileWriter("testdata.txt");

            writer.write("QA Automation Testing\n");
            writer.write("Browser: Chrome\n");
            writer.write("Test Status: Passed\n");

            writer.close();

            System.out.println("Data written successfully.");

            // Read data from the file
            FileReader reader = new FileReader("testdata.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}
