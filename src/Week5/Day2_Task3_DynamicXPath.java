package Week5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task3_DynamicXPath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

        // 1. Dynamic XPath using contains()
        WebElement username =
                driver.findElement(By.xpath("//input[contains(@id,'username')]"));

        username.sendKeys("tomsmith");

        // 2. Dynamic XPath using starts-with()
        WebElement password =
                driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));

        password.sendKeys("SuperSecretPassword!");

        // 3. Dynamic XPath using text()
        WebElement loginButton =
                driver.findElement(By.xpath("//button[contains(.,'Login')]"));

        loginButton.click();

        // Verify result
        WebElement message =
                driver.findElement(By.xpath("//div[contains(@id,'flash')]"));

        System.out.println("Result: " + message.getText());

        driver.quit();
    }
}
