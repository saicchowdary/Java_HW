package Week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Day5_LoginMiniProject {

    public static void main(String[] args) {

        WebDriver driver = null;

        try {

            // STEP 1: Launch Chrome Browser
            driver = new ChromeDriver();

            driver.manage().window().maximize();

            System.out.println("Browser Launched Successfully");

            // STEP 2: Open Login Page
            driver.get("https://the-internet.herokuapp.com/login");

            System.out.println("Login Page Opened Successfully");

            // STEP 3: Enter Username
            WebElement username = driver.findElement(By.id("username"));

            username.sendKeys("tomsmith");

            System.out.println("Username Entered Successfully");

            // STEP 4: Enter Password
            WebElement password = driver.findElement(By.id("password"));

            password.sendKeys("SuperSecretPassword!");

            System.out.println("Password Entered Successfully");

            // STEP 5: Click Login Button
            WebElement loginButton =
                    driver.findElement(By.cssSelector("button[type='submit']"));

            loginButton.click();

            System.out.println("Login Button Clicked");

            // STEP 6: Validate Login
            String actualMessage =
                    driver.findElement(By.id("flash")).getText();

            String expectedMessage = "You logged into a secure area!";

            if (actualMessage.contains(expectedMessage)) {

                System.out.println("TEST PASSED: Login Successful");

            } else {

                throw new AssertionError("TEST FAILED: Login Unsuccessful");

            }

            // STEP 7: Capture Screenshot
            File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            Files.createDirectories(Paths.get("screenshots"));

            Files.copy(
                    screenshot.toPath(),
                    Paths.get("screenshots", "Week5_Day5_Login.png"),
                    StandardCopyOption.REPLACE_EXISTING
            );

            System.out.println("Screenshot Captured Successfully");

            // STEP 8: Validate Logout Button
            WebElement logoutButton =
                    driver.findElement(By.cssSelector("a.button"));

            if (logoutButton.isDisplayed()) {

                System.out.println("Logout Button Displayed");

            } else {

                throw new AssertionError("Logout Button Not Displayed");

            }

            // STEP 9: Click Logout
            logoutButton.click();

            System.out.println("Logout Successful");

            // STEP 10: Verify Logout
            if (driver.getCurrentUrl().contains("/login")) {

                System.out.println("TEST PASSED: Logout Successful");

            } else {

                throw new AssertionError("TEST FAILED: Logout Unsuccessful");

            }

        } catch (Exception e) {

            System.out.println("TEST FAILED: " + e.getMessage());

            throw new RuntimeException(e);

        } finally {

            // STEP 11: Close Browser
            if (driver != null) {

                driver.quit();

            }

            System.out.println("Browser Closed");

        }
    }
}
