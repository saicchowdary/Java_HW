package Week6;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Day3_Task2_ParameterizedTests {

    @DataProvider(name = "loginData")
    public Object[][] data() {
        return new Object[][] {
                {"admin", "1234", true},
                {"user", "wrong", false},
                {"admin", "wrong", false}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password,
                          boolean expected) {

        boolean actual = username.equals("admin")
                && password.equals("1234");

        Assert.assertEquals(actual, expected);

        System.out.println("Login Test Passed: " + username);
    }
}
