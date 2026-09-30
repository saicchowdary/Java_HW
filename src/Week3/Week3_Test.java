package Week3;


public class Week3_Test {

    public static void main(String[] args) {

        // 1. STRING VALIDATION
        System.out.println("----- String Validation -----");

        String email = "deep@gmail.com";

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }


        // 2. ARRAY PROBLEM
        System.out.println("\n----- Array Problem -----");

        int[] marks = {80, 90, 75, 95, 85};

        int highest = marks[0];

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }

        System.out.println("Highest Mark: " + highest);


        // 3. BASIC OOP
        System.out.println("\n----- Basic OOP -----");

        Tester tester = new Tester();

        tester.name = "Deep";
        tester.role = "QA Tester";

        tester.displayDetails();
    }
}


// OOP Class
class Tester {

    String name;
    String role;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
}
