package Week5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

        public class Week5_Day1_Test {
            public static void main(String[] args) {

                WebDriver driver = new ChromeDriver();

                driver.get("https://www.saucedemo.com/");

                driver.findElement(By.id("user-name"))
                        .sendKeys("standard_user");

                driver.findElement(By.id("password"))
                        .sendKeys("secret_sauce");

                driver.findElement(By.id("login-button")).click();

                if (driver.getCurrentUrl().contains("inventory.html")) {
                    System.out.println("TEST PASSED");
                } else {
                    System.out.println("TEST FAILED");
                }

                driver.quit();
            }
        }
