package Week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3_Task2_DragDrop {

    public static void main(String[] args) {

        // Step 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Maximize browser
            driver.manage().window().maximize();

            // Step 3: Open drag and drop website
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");

            // Step 4: Find source element
            WebElement source = driver.findElement(By.id("column-a"));

            // Step 5: Find target element
            WebElement target = driver.findElement(By.id("column-b"));

            // Step 6: Create Actions object
            Actions actions = new Actions(driver);

            // Step 7: Perform drag and drop
            actions.dragAndDrop(source, target).perform();

            // Step 8: Verify result
            String result = driver.findElement(
                    By.id("column-a")).getText();

            if (result.equals("B")) {
                System.out.println("Drag and Drop Test Passed");
            } else {
                System.out.println("Drag and Drop Test Failed");
            }

        } finally {
            // Step 9: Close browser
            driver.quit();
        }
    }
}