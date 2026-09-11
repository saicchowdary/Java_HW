package Week1;
public class Day4_Task2_MethodArgs {

    public static void login(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void launchBrowser(String browserName) {
        System.out.println("Launching Browser: " + browserName);
    }

    public static void main(String[] args) {

        login("Deep", "Test123");
        launchBrowser("Chrome");
    }
}
