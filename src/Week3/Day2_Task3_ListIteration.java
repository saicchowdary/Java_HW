package Week3;


import java.util.ArrayList;

public class Day2_Task3_ListIteration {

    public static void main(String[] args) {

        ArrayList<String> browsers = new ArrayList<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        // Loop through the collection
        for (String browser : browsers) {

            System.out.println("Testing Browser: " + browser);

            // Validation
            if (browser.equals("Chrome")) {
                System.out.println("Chrome browser found");
            }
        }
    }
}
