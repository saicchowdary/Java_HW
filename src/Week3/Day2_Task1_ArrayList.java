package Week3;

import java.util.ArrayList;

public class Day2_Task1_ArrayList {

    public static void main(String[] args) {

        // Store browser names
        ArrayList<String> browsers = new ArrayList<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        System.out.println("Browsers: " + browsers);

        // Store URLs
        ArrayList<String> urls = new ArrayList<>();

        urls.add("https://google.com");
        urls.add("https://example.com");

        System.out.println("URLs: " + urls);

        // Store user roles
        ArrayList<String> userRoles = new ArrayList<>();

        userRoles.add("Admin");
        userRoles.add("Tester");
        userRoles.add("User");

        System.out.println("User Roles: " + userRoles);
    }
}
