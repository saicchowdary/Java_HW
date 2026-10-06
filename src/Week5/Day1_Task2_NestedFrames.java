package Week5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Task2_NestedFrames {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();

        // Switch to parent TOP frame
        driver.switchTo().frame("frame-top");

        // Switch to child LEFT frame
        driver.switchTo().frame("frame-left");

        // Get text from LEFT frame
        String text = driver.findElement(By.tagName("body")).getText();

        System.out.println("Nested Frame Text: " + text);

        // Return to main webpage
        driver.switchTo().defaultContent();

        System.out.println("Returned to main page successfully");

        driver.quit();

        System.out.println("Nested frames completed successfully");
    }
}
