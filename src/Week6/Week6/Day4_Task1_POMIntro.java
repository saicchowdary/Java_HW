package Week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day4_Task1_POMIntro {

    @Test
    public void testLogin() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/login");

            LoginPage page = new LoginPage(driver);

            page.login("tomsmith", "SuperSecretPassword!");

            System.out.println("Login completed");

        } finally {
            driver.quit();
        }
    }

    static class LoginPage {

        WebDriver driver;

        By username = By.id("username");
        By password = By.id("password");
        By loginButton = By.cssSelector("button[type='submit']");

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void login(String user, String pass) {

            driver.findElement(username).sendKeys(user);
            driver.findElement(password).sendKeys(pass);
            driver.findElement(loginButton).click();
        }
    }
}
