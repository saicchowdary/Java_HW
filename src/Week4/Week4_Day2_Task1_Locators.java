package Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4_Day2_Task1_Locators {

    public static void main(String[] args) {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open Selenium test page
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.manage().window().maximize();

        // 1. Locate using ID
        WebElement textBox =
                driver.findElement(By.id("my-text-id"));

        // 2. Locate using NAME
        WebElement password =
                driver.findElement(By.name("my-password"));

        // 3. Locate using CLASS NAME
        WebElement formControl =
                driver.findElement(By.className("form-control"));

        // 4. Locate using XPATH
        WebElement submitButton =
                driver.findElement(By.xpath("//button[@type='submit']"));

        // 5. Locate using CSS SELECTOR
        WebElement textArea =
                driver.findElement(By.cssSelector("textarea[name='my-textarea']"));

        System.out.println("ID Locator: " + textBox.isDisplayed());
        System.out.println("Name Locator: " + password.isDisplayed());
        System.out.println("Class Locator: " + formControl.isDisplayed());
        System.out.println("XPath Locator: " + submitButton.isDisplayed());
        System.out.println("CSS Locator: " + textArea.isDisplayed());

        // Close browser
        driver.quit();
    }
}
