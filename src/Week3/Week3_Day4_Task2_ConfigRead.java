package Week3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Week3_Day4_Task2_ConfigRead {

    public static void main(String[] args) {

        Properties properties = new Properties();

        try {
            FileInputStream file =
                    new FileInputStream("config.properties");

            properties.load(file);

            String browser = properties.getProperty("browser");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");

            System.out.println("Browser: " + browser);
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);

            file.close();

        } catch (IOException e) {
            System.out.println("Unable to read config file.");
        }
    }
}
