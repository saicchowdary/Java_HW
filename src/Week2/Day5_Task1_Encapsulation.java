package Week2;


public class Day5_Task1_Encapsulation {

    // Private variables
    private String username;
    private String password;

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {

        Day5_Task1_Encapsulation login =
                new Day5_Task1_Encapsulation();

        login.setUsername("Deep");
        login.setPassword("1234");

        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());
    }
}