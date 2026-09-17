package Week2;

public class Day4_Task3_Polymorphism {

    void startBrowser() {
        System.out.println("Starting Browser");
    }
}

class EdgeBrowser extends Day4_Task3_Polymorphism {

    @Override
    void startBrowser() {
        System.out.println("Starting Edge Browser");
    }

    public static void main(String[] args) {

        Day4_Task3_Polymorphism browser = new EdgeBrowser();

        browser.startBrowser();
    }
}
