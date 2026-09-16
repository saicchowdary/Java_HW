package Week2;

public class Day3_Task2_ObjectUse {

    String browserName;
    String version;

    void openBrowser() {
        System.out.println("Opening Browser: " + browserName);
        System.out.println("Browser Version: " + version);
    }

    public static void main(String[] args) {

        Day3_Task2_ObjectUse browser = new Day3_Task2_ObjectUse();

        browser.browserName = "Chrome";
        browser.version = "140";

        browser.openBrowser();
    }
}
