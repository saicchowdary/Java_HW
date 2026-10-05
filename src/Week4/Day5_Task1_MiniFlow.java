package Week4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_Task1_MiniFlow {

    public static void main(String[] args) {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click Login
        driver.findElement(By.id("login-button"))
                .click();

        // Verify result
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("inventory")) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }

        // Close browser
        driver.quit();
    }
}
