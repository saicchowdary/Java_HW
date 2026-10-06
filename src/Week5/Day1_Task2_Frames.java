package Week5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Task2_Frames {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();

        // Switch to frame
        driver.switchTo().frame("mce_0_ifr");

        // Get text inside frame
        String frameText = driver.findElement(By.id("tinymce")).getText();

        System.out.println("Text inside frame: " + frameText);

        // Switch back to main page
        driver.switchTo().defaultContent();

        System.out.println("Switched back to main page successfully");

        Thread.sleep(2000);

        driver.quit();

        System.out.println("Frames handling completed successfully");
    }
}
