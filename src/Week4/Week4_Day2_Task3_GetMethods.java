package Week4;6

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4_Day2_Task3_GetMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();

        WebElement textBox =
                driver.findElement(By.id("my-text-id"));

        textBox.sendKeys("Deep");

        // Get Attribute
        String value = textBox.getAttribute("value");

        System.out.println("Textbox Value: " + value);

        WebElement button =
                driver.findElement(By.xpath("//button[@type='submit']"));

        // Get Text
        String buttonText = button.getText();

        System.out.println("Button Text: " + buttonText);

        // Verify values
        if (value.equals("Deep")) {
            System.out.println("Textbox value verified");
        }

        if (buttonText.equals("Submit")) {
            System.out.println("Button text verified");
        }

        driver.quit();
    }
}

