package Week3;

import java.util.HashMap;

public class Day3_Task1_HashMap {

    public static void main(String[] args) {

        // Store username and password
        HashMap<String, String> loginData = new HashMap<>();

        loginData.put("admin", "admin123");
        loginData.put("tester", "test123");
        loginData.put("user", "user123");

        System.out.println("Username and Password Data:");
        System.out.println(loginData);

        // Configuration values
        HashMap<String, String> config = new HashMap<>();

        config.put("browser", "Chrome");
        config.put("url", "https://example.com");

        System.out.println("Configuration Data:");
        System.out.println(config);
    }
}
