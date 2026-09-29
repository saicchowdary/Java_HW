package Week4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4_Day1_Task1_SeleniumSetup {

    public static void main(String[] args) {

        // Open Chrome browser
        WebDriver driver = new ChromeDriver();

        System.out.println("Chrome browser opened successfully");

        // Close Chrome browser
        driver.quit();

        System.out.println("Chrome browser closed successfully");
    }
}
