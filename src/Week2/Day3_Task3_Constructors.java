package Week2;

public class Day3_Task3_Constructors {

    String browserName;
    String version;

    Day3_Task3_Constructors(String browserName, String version) {
        this.browserName = browserName;
        this.version = version;
    }

    void displayBrowser() {
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + version);
    }

    public static void main(String[] args) {

        Day3_Task3_Constructors browser =
                new Day3_Task3_Constructors("Chrome", "140");

        browser.displayBrowser();
    }
}
