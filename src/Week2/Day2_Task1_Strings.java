package Week2;

public class Day2_Task1_Strings {

    public static void main(String[] args) {

        String text = "QA Automation";

        // length()
        System.out.println("Length: " + text.length());

        // equals()
        System.out.println("Equals: " + text.equals("QA Automation"));

        // contains()
        System.out.println("Contains QA: " + text.contains("QA"));

        // substring()
        System.out.println("Substring: " + text.substring(0, 2));

        // toUpperCase()
        System.out.println("Uppercase: " + text.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + text.toLowerCase());
    }
}
