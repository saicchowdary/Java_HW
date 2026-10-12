package Week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3_Task1_MouseActions {

    public static void main(String[] args) {

        // Step 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Step 2: Maximize browser
        driver.manage().window().maximize();

        // Step 3: Create Actions object
        Actions actions = new Actions(driver);

        // Step 4: Mouse Hover
        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement image = driver.findElement(
                By.className("figure"));

        actions.moveToElement(image).perform();

        System.out.println("Mouse Hover Successful");

        // Step 5: Right Click
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = driver.findElement(
                By.id("hot-spot"));

        actions.contextClick(box).perform();

        System.out.println("Right Click Successful");

        // Close alert
        driver.switchTo().alert().accept();

        // Step 6: Double Click
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(
                By.id("doubleClickBtn"));

        actions.doubleClick(doubleClickButton).perform();

        System.out.println("Double Click Successful");

        // Step 7: Close browser
        driver.quit();
    }
}
