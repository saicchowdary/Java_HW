package go;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Day3_Task1_DataProvider {

    @DataProvider(name = "numbers")
    public Object[][] data() {
        return new Object[][] {
                {10, 20},
                {30, 40},
                {50, 60}
        };
    }

    @Test(dataProvider = "numbers")
    public void testAddition(int a, int b) {
        int sum = a + b;
        Assert.assertTrue(sum > 0);
        System.out.println("Sum = " + sum);
    }
}
