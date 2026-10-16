package Week6.Week6;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

// Reusable Base Class
class BrowserBase {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        System.out.println("Browser Opened");
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Browser Closed");
    }
}

// Test Class
public class Day4_Task3_BaseClassNew extends BrowserBase {

    @Test
    public void testWebsite() {

        driver.get("https://example.com");

        Assert.assertEquals(driver.getTitle(), "Example Domain");

        System.out.println("Test Passed");
    }
}
