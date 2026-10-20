package Week7;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Day1_Task2_PostmanGET {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users/1");

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int statusCode = connection.getResponseCode();

            System.out.println("Status Code: " + statusCode);

            Scanner scanner = new Scanner(connection.getInputStream());

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}