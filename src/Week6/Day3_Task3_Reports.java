package Week6;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3_Task3_Reports {

    @Test
    public void test1() {
        Assert.assertEquals(10, 10);
        System.out.println("Test 1 Passed");
    }

    @Test
    public void test2() {
        Assert.assertTrue(20 > 10);
        System.out.println("Test 2 Passed");
    }

    @Test
    public void test3() {
        Assert.assertEquals("Java", "Java");
        System.out.println("Test 3 Passed");
    }
}
