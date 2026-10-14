package Week6;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2_Task2_MultipleTests {

    // Test 1: Valid Login
    @Test
    public void validLogin() {
        String username = "admin";
        String password = "admin123";

        Assert.assertEquals(username, "admin");
        Assert.assertEquals(password, "admin123");

        System.out.println("Valid Login: PASSED");
    }

    // Test 2: Invalid Login
    @Test
    public void invalidLogin() {
        String password = "wrong123";

        Assert.assertNotEquals(password, "admin123");

        System.out.println("Invalid Login: PASSED");
    }

    // Test 3: Empty Fields
    @Test
    public void emptyFields() {
        String username = "";
        String password = "";

        Assert.assertTrue(username.isEmpty());
        Assert.assertTrue(password.isEmpty());

        System.out.println("Empty Fields: PASSED");
    }
}
