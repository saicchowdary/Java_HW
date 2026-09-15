package Week2;



public class Day2_Task3_StringCompare {

    public static void main(String[] args) {

        String browser1 = "Chrome";
        String browser2 = "Chrome";
        String browser3 = new String("Chrome");

        System.out.println("Using == : " + (browser1 == browser2));
        System.out.println("Using == : " + (browser1 == browser3));

        System.out.println("Using equals(): "
                + browser1.equals(browser3));
    }
}
