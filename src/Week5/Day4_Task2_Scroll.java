package Week5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day4_Task2_Scroll {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            // Step 1: Maximize browser
            driver.manage().window().maximize();

            // Step 2: Open website
            driver.get("https://www.selenium.dev/documentation/");

            System.out.println("Website Opened Successfully");

            // Step 3: Create JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Step 4: Scroll down
            js.executeScript("window.scrollBy(0,500)");

            System.out.println("Scrolled Down Successfully");

            Thread.sleep(2000);

            // Step 5: Scroll up
            js.executeScript("window.scrollBy(0,-500)");

            System.out.println("Scrolled Up Successfully");

            Thread.sleep(2000);

            // Step 6: Scroll to bottom
            js.executeScript(
                    "window.scrollTo(0,document.body.scrollHeight)"
            );

            System.out.println("Scrolled to Bottom");

            Thread.sleep(2000);

            // Step 7: Scroll to top
            js.executeScript("window.scrollTo(0,0)");

            System.out.println("Scrolled to Top");

            Thread.sleep(2000);

            // Step 8: Scroll to specific element
            WebElement element =
                    driver.findElement(By.tagName("footer"));

            js.executeScript(
                    "arguments[0].scrollIntoView(true);",
                    element
            );

            System.out.println("Scrolled to Footer Element");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            // Step 9: Close browser
            driver.quit();

        }
    }
}
