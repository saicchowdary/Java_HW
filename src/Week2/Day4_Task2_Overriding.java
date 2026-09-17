package Week2;

public class Day4_Task2_Overriding {

    void browserMessage() {
        System.out.println("Opening Browser");
    }
}

class FirefoxBrowser extends Day4_Task2_Overriding {

    @Override
    void browserMessage() {
        System.out.println("Opening Firefox Browser");
    }

    public static void main(String[] args) {

        FirefoxBrowser browser = new FirefoxBrowser();

        browser.browserMessage();
    }
}
