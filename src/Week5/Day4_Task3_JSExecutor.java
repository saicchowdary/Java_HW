package Week5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day4_Task3_JSExecutor {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            // Step 1: Maximize browser
            driver.manage().window().maximize();

            // Step 2: Open website
            driver.get("https://the-internet.herokuapp.com/login");

            System.out.println("Website Opened Successfully");

            // Step 3: Create JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Step 4: Locate username textbox
            WebElement username =
                    driver.findElement(By.id("username"));

            // Step 5: Enter username using JavaScript
            js.executeScript(
                    "arguments[0].value='tomsmith';",
                    username
            );

            System.out.println("Username Entered Successfully");

            // Step 6: Locate password textbox
            WebElement password =
                    driver.findElement(By.id("password"));

            // Step 7: Enter password using JavaScript
            js.executeScript(
                    "arguments[0].value='SuperSecretPassword!';",
                    password
            );

            System.out.println("Password Entered Successfully");

            // Step 8: Locate login button
            WebElement loginButton =
                    driver.findElement(By.cssSelector("button[type='submit']"));

            // Step 9: Click login using JavaScript
            js.executeScript(
                    "arguments[0].click();",
                    loginButton
            );

            System.out.println("Login Button Clicked Successfully");

            // Step 10: Verify login result
            String currentURL = driver.getCurrentUrl();

            if (currentURL.contains("/secure")) {

                System.out.println("Login Test Passed");

            } else {

                System.out.println("Login Test Failed");

            }

            Thread.sleep(3000);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            // Step 11: Close browser
            driver.quit();

        }
    }
}
