package Week4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Task2_Navigation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open first website
        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        // Open another website
        driver.navigate().to("https://www.selenium.dev");

        // Go back
        driver.navigate().back();

        // Go forward
        driver.navigate().forward();

        // Refresh page
        driver.navigate().refresh();

        System.out.println("Final Title: " + driver.getTitle());
        System.out.println("Final URL: " + driver.getCurrentUrl());

        driver.quit();
    }
}
