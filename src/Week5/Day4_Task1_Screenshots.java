package Week5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Day4_Task1_Screenshots {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            // Step 1: Maximize browser
            driver.manage().window().maximize();

            // Step 2: Open Google
            driver.get("https://www.google.com");

            // Step 3: Print page title
            System.out.println("Page Title: " + driver.getTitle());

            // Step 4: Capture screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            // Step 5: Create screenshots folder
            Path folder = Paths.get("screenshots");

            Files.createDirectories(folder);

            // Step 6: Save screenshot
            Path destination = folder.resolve("Day4_Task1.png");

            Files.copy(
                    source.toPath(),
                    destination,
                    StandardCopyOption.REPLACE_EXISTING
            );

            // Step 7: Print success message
            System.out.println("Screenshot Saved Successfully");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            // Step 8: Close browser
            driver.quit();

        }
    }
}
