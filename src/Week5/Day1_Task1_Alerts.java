package Week5;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Task1_Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // 1. Simple Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert Text: " + alert.getText());

        alert.accept();


        // 2. Confirm Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Alert confirmAlert = driver.switchTo().alert();

        System.out.println("Confirm Text: " + confirmAlert.getText());

        confirmAlert.dismiss();


        // 3. Prompt Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert promptAlert = driver.switchTo().alert();

        System.out.println("Prompt Text: " + promptAlert.getText());

        promptAlert.sendKeys("Deep");

        promptAlert.accept();


        Thread.sleep(2000);

        driver.quit();

        System.out.println("Alerts handling completed successfully");
    }
}
