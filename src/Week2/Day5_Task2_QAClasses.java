package Week2;

public class Day5_Task2_QAClasses {

    String testCaseName;
    String testData;
    String bugReport;

    void displayTestCase() {
        System.out.println("Test Case: " + testCaseName);
    }

    void displayTestData() {
        System.out.println("Test Data: " + testData);
    }

    void displayBugReport() {
        System.out.println("Bug Report: " + bugReport);
    }

    public static void main(String[] args) {

        Day5_Task2_QAClasses qa = new Day5_Task2_QAClasses();

        qa.testCaseName = "Login Test";
        qa.testData = "Username: admin";
        qa.bugReport = "Login button not working";

        qa.displayTestCase();
        qa.displayTestData();
        qa.displayBugReport();
    }
}
