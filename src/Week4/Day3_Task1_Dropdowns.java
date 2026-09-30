package Week4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Task1_Dropdowns {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();

        WebElement dropdown =
                driver.findElement(By.name("my-select"));

        Select select = new Select(dropdown);

        // Select by visible text
        select.selectByVisibleText("Two");

        // Select by value
        select.selectByValue("3");

        // Select by index
        select.selectByIndex(1);

        System.out.println("Dropdown handling completed.");

        driver.quit();
    }
}
