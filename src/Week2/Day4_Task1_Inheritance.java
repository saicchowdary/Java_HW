package Week2;

public class Day4_Task1_Inheritance {

    void openBrowser() {
        System.out.println("Opening Browser");
    }
}

class ChromeBrowser extends Day4_Task1_Inheritance {

    void loginTest() {
        System.out.println("Running Login Test in Chrome");
    }

    public static void main(String[] args) {

        ChromeBrowser browser = new ChromeBrowser();

        browser.openBrowser();
        browser.loginTest();
    }
}
