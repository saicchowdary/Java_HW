package Week5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day2_Task2_WebTables {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open web table page
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();

        // Get all rows from Table 1
        List<WebElement> rows =
                driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        System.out.println("Total Rows: " + rows.size());

        // Read each row
        for (WebElement row : rows) {

            List<WebElement> columns =
                    row.findElements(By.tagName("td"));

            for (WebElement column : columns) {
                System.out.print(column.getText() + " | ");
            }

            System.out.println();
        }

        // Verify a specific value
        String expectedValue = "Smith";

        String actualValue =
                driver.findElement(
                                By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"))
                        .getText();

        if (actualValue.equals(expectedValue)) {
            System.out.println("PASS: Value is " + actualValue);
        } else {
            System.out.println("FAIL: Value is " + actualValue);
        }

        driver.quit();
    }
}
