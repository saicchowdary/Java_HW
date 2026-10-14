package Week6;
import org.testng.annotations.Test;

public class Day2_Task3_PriorityGroups {

    // Test 1: Login
    @Test(priority = 1, groups = {"smoke"})
    public void loginTest() {
        System.out.println("1. Login Test Passed");
    }

    // Test 2: Search
    @Test(priority = 2, groups = {"regression"})
    public void searchTest() {
        System.out.println("2. Search Test Passed");
    }

    // Test 3: Logout
    @Test(priority = 3, groups = {"smoke"})
    public void logoutTest() {
        System.out.println("3. Logout Test Passed");
    }

    // Test 4: Disabled
    @Test(priority = 4, enabled = false)
    public void disabledTest() {
        System.out.println("4. Disabled Test");
    }
}
