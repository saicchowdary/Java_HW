package Week4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4_Day1_Task2_OpenURL {

    public static void main(String[] args) {

        // Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.google.com");

        // Maximize browser
        driver.manage().window().maximize();

        // Get page title
        String title = driver.getTitle();

        // Print page title
        System.out.println("Page Title: " + title);

        // Close browser
        driver.quit();

        System.out.println("Browser closed successfully");
    }
}
