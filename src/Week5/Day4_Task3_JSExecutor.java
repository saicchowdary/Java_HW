package Week5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Task3_JSExecutor {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            // Step 1: Launch Browser
            driver.manage().window().maximize();

            // Step 2: Open Website
            driver.get("https://the-internet.herokuapp.com/login");

            System.out.println("Website Opened Successfully");

            // Step 3: Create JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Step 4: Enter Username Using JavaScript
            js.executeScript(
                    "arguments[0].value='tomsmith';",
                    driver.findElement(By.id("username"))
            );

            System.out.println("Username Entered");

            // Step 5: Enter Password Using JavaScript
            js.executeScript(
                    "arguments[0].value='SuperSecretPassword!';",
                    driver.findElement(By.id("password"))
            );

            System.out.println("Password Entered");

            // Step 6: Click Login Using JavaScript
            js.executeScript(
                    "arguments[0].click();",
                    driver.findElement(By.cssSelector("button[type='submit']"))
            );

            System.out.println("Login Button Clicked");

            // Step 7: Validate Login
            String message = driver.findElement(By.id("flash")).getText();

            if (message.contains("You logged into a secure area!")) {

                System.out.println("TEST PASSED");

            } else {

                System.out.println("TEST FAILED");

            }

        } finally {

            // Step 8: Close Browser
            driver.quit();

            System.out.println("Browser Closed");

        }
    }
}
