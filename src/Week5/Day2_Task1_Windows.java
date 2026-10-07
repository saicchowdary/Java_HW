package Week5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Day2_Task1_Windows {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        // Store parent window
        String parentWindow = driver.getWindowHandle();

        // Click to open new window
        driver.findElement(By.linkText("Click Here")).click();

        Thread.sleep(2000);

        // Get all windows
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to new window
        for (String window : allWindows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                String text = driver.findElement(By.tagName("h3")).getText();

                System.out.println("New Window Text: " + text);

                driver.close();
            }
        }

        // Return to parent window
        driver.switchTo().window(parentWindow);

        driver.quit();
    }
}
