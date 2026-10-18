
package Week6.Week6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5_MiniProject2_LoginTest  {

    @Test
    public void validLogin() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://practicetestautomation.com/practice-test-login/");

            Day5_MiniProject2_LoginPage page =
                    new Day5_MiniProject2_LoginPage(driver);

            page.login("student", "Password123");

            Assert.assertTrue(
                    driver.getCurrentUrl().contains("logged-in-successfully")
            );

            System.out.println("Valid Login Passed");

        } finally {
            driver.quit();
        }
    }

    @Test
    public void invalidLogin() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://practicetestautomation.com/practice-test-login/");

            Day5_MiniProject2_LoginPage page =
                    new Day5_MiniProject2_LoginPage(driver);

            page.login("wronguser", "wrongpass");

            Assert.assertTrue(
                    driver.findElement(By.id("error")).isDisplayed()
            );

            System.out.println("Invalid Login Passed");

        } finally {
            driver.quit();
        }
    }
}
