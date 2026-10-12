package Week5;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3_Task3_KeyboardActions {

    public static void main(String[] args) {

        // Step 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Maximize browser
            driver.manage().window().maximize();

            // Step 3: Open website
            driver.get("https://the-internet.herokuapp.com/key_presses");

            // Step 4: Create Actions object
            Actions actions = new Actions(driver);

            // Step 5: Press TAB key
            actions.sendKeys(Keys.TAB).perform();

            System.out.println("TAB Key Pressed");

            // Step 6: Press ENTER key
            actions.sendKeys(Keys.ENTER).perform();

            System.out.println("ENTER Key Pressed");

            // Step 7: Open text input website
            driver.get("https://the-internet.herokuapp.com/inputs");

            // Step 8: Find input box
            WebElement input = driver.findElement(
                    By.tagName("input"));

            // Step 9: Enter number
            input.sendKeys("12345");

            System.out.println("Number Entered");

            // Step 10: Select all text using CTRL + A
            actions.click(input)
                    .keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .keyUp(Keys.CONTROL)
                    .perform();

            System.out.println("CTRL + A Successful");

            // Step 11: Copy text using CTRL + C
            actions.keyDown(Keys.CONTROL)
                    .sendKeys("c")
                    .keyUp(Keys.CONTROL)
                    .perform();

            System.out.println("CTRL + C Successful");

            // Step 12: Paste text using CTRL + V
            actions.keyDown(Keys.CONTROL)
                    .sendKeys("v")
                    .keyUp(Keys.CONTROL)
                    .perform();

            System.out.println("CTRL + V Successful");

            // Step 13: Verify input value
            String actualValue = input.getAttribute("value");

            if ("12345".equals(actualValue)) {
                System.out.println("Keyboard Actions Test Passed");
            } else {
                System.out.println("Keyboard Actions Test Failed");
            }

        } finally {
            // Step 14: Close browser
            driver.quit();
        }
    }
}
