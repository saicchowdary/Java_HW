package Week2;


public class Day1_Task3_ArraySearch {

    public static void main(String[] args) {

        String[] browsers = {"Chrome", "Firefox", "Edge", "Safari"};

        String searchBrowser = "Chrome";

        boolean found = false;

        for (String browser : browsers) {

            if (browser.equals(searchBrowser)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchBrowser + " browser found");
        } else {
            System.out.println(searchBrowser + " browser not found");
        }
    }
}
