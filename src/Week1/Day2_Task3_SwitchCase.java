package Week1;

public class Day2_Task3_SwitchCase {

    public static void main(String[] args) {

        int browser = 2;

        switch (browser) {

            case 1:
                System.out.println("Opening Chrome");
                break;

            case 2:
                System.out.println("Opening Firefox");
                break;

            case 3:
                System.out.println("Opening Edge");
                break;

            default:
                System.out.println("Invalid Browser");
        }
    }
}