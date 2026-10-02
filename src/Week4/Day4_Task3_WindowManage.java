package Week4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Task3_WindowManage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev");

        // Maximize browser
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Minimize browser
        driver.manage().window().minimize();
        Thread.sleep(2000);

        // Maximize again
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Close browser
        driver.quit();

        System.out.println("Browser window management completed");
    }
}
