package Week3;

import java.util.HashMap;

public class Day3_Task3_TestDataMap {

    public static void main(String[] args) {

        HashMap<String, String> testData = new HashMap<>();

        testData.put("browser", "Chrome");
        testData.put("url", "https://example.com");
        testData.put("username", "testuser");

        System.out.println("Test Data:");

        System.out.println("Browser: " + testData.get("browser"));
        System.out.println("URL: " + testData.get("url"));
        System.out.println("Username: " + testData.get("username"));
    }
}
