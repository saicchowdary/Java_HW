package Week4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_Task2_Refactor {

    static WebDriver driver;

    // Reusable method to open browser
    public static void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Reusable method to open website
    public static void openWebsite() {
        driver.get("https://www.saucedemo.com/");
    }

    // Reusable method for login
    public static void login() {
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();
    }

    // Reusable method to verify result
    public static void verifyLogin() {

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("inventory")) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }
    }

    // Reusable method to close browser
    public static void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) {

        openBrowser();
        openWebsite();
        login();
        verifyLogin();
        closeBrowser();
    }
}
