package Week2;


public class Day2_Task2_StringValidation {

    public static void main(String[] args) {

        String email = "deep@gmail.com";
        String password = "Password123";
        String url = "https://www.google.com";

        // Check email
        if (email.contains("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        // Check password length
        if (password.length() >= 8) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        // Check URL
        if (url.startsWith("https://")) {
            System.out.println("Valid URL");
        } else {
            System.out.println("Invalid URL");
        }
    }
}
