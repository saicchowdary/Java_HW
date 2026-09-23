package Week3;

import java.util.HashMap;

public class Day3_Task2_MapValidation {

    public static void main(String[] args) {

        HashMap<String, String> users = new HashMap<>();

        users.put("admin", "admin123");
        users.put("tester", "test123");
        users.put("user", "user123");

        String username = "tester";

        if (users.containsKey(username)) {
            System.out.println("Username found.");
            System.out.println("Password: " + users.get(username));
        } else {
            System.out.println("Error: Username not found.");
        }
    }
}