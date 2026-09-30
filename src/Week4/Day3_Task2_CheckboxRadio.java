package Week4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Task2_CheckboxRadio {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();

        // Checkbox
        WebElement checkbox =
                driver.findElement(By.id("my-check-2"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        System.out.println("Checkbox selected: "
                + checkbox.isSelected());

        // Radio Button
        WebElement radio =
                driver.findElement(By.id("my-radio-2"));

        if (!radio.isSelected()) {
            radio.click();
        }

        System.out.println("Radio button selected: "
                + radio.isSelected());

        driver.quit();
    }
}
