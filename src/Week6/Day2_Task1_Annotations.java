package Week6;
import org.testng.annotations.*;

public class Day2_Task1_Annotations {

    @BeforeClass
    public void beforeClass() {
        System.out.println("1. Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("2. Before Method");
    }

    @Test
    public void loginTest() {
        System.out.println("3. Login Test Executed");
    }

    @Test
    public void logoutTest() {
        System.out.println("3. Logout Test Executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("4. After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("5. After Class");
    }
}
