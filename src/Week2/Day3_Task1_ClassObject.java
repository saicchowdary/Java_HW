package Week2;

public class Day3_Task1_ClassObject {

    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }

    public static void main(String[] args) {

        Day3_Task1_ClassObject employee = new Day3_Task1_ClassObject();

        employee.employeeName = "Deep";
        employee.employeeId = 101;

        employee.displayEmployee();
    }
}
