package Week3;


import java.util.ArrayList;

public class Day2_Task2_ListOps {

    public static void main(String[] args) {

        ArrayList<String> browsers = new ArrayList<>();

        // add()
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        System.out.println("Browser List: " + browsers);

        // get()
        System.out.println("First Browser: " + browsers.get(0));

        // contains()
        System.out.println("Contains Chrome: " + browsers.contains("Chrome"));

        // size()
        System.out.println("List Size: " + browsers.size());

        // remove()
        browsers.remove("Firefox");

        System.out.println("After Removing Firefox: " + browsers);
    }
}
