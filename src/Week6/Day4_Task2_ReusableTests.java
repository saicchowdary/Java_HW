package Week6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4_Task2_ReusableTests {

    // Reusable Login Page
    static class LoginPage {

        WebDriver driver;

        LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        void login(String username, String password) {

            driver.findElement(By.id("username")).sendKeys(username);

            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.cssSelector("button[type='submit']")).click();
        }
    }

    // Test 1: Valid Login
    @Test
    public void validLogin() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/login");

            LoginPage page = new LoginPage(driver);

            page.login("tomsmith", "SuperSecretPassword!");

            Assert.assertTrue(
                    driver.getCurrentUrl().contains("/secure")
            );

            System.out.println("Valid Login Passed");

        } finally {
            driver.quit();
        }
    }

    // Test 2: Invalid Login
    @Test
    public void invalidLogin() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/login");

            LoginPage page = new LoginPage(driver);

            page.login("wronguser", "wrongpass");

            Assert.assertTrue(
                    driver.findElement(By.id("flash"))
                            .getText().contains("Your username is invalid!")
            );

            System.out.println("Invalid Login Passed");

        } finally {
            driver.quit();
        }
    }
}
