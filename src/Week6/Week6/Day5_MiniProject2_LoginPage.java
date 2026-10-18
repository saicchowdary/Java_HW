package Week6.Week6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Day5_MiniProject2_LoginPage {

    WebDriver driver;

    public Day5_MiniProject2_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {

        driver.findElement(By.id("username"))
                .sendKeys(username);

        driver.findElement(By.id("password"))
                .sendKeys(password);

        driver.findElement(By.id("submit"))
                .click();
    }
}
