package Week4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4_Day2_Task2_WebActions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();

        // Find textbox
        WebElement textBox =
                driver.findElement(By.id("my-text-id"));

        // Enter data
        textBox.sendKeys("Deep");

        // Find password field
        WebElement password =
                driver.findElement(By.name("my-password"));

        password.sendKeys("Testing123");

        System.out.println("Data entered successfully");

        // Find and click button
        WebElement button =
                driver.findElement(By.xpath("//button[@type='submit']"));

        button.click();

        System.out.println("Button clicked successfully");

        driver.quit();
    }
}
