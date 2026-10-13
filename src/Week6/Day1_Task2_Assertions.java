package Week6;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1_Task2_Assertions {

    // Test 1: Verify student name
    @Test
    public void verifyStudentName() {

        String expectedName = "Rahul";
        String actualName = "Rahul";

        Assert.assertEquals(actualName, expectedName);

        System.out.println("Student Name Test Passed");
    }

    // Test 2: Verify student marks
    @Test
    public void verifyStudentMarks() {

        int expectedMarks = 85;
        int actualMarks = 85;

        Assert.assertEquals(actualMarks, expectedMarks);

        System.out.println("Student Marks Test Passed");
    }

    // Test 3: Verify pass status
    @Test
    public void verifyPassStatus() {

        int marks = 75;

        Assert.assertTrue(marks >= 40);

        System.out.println("Student Pass Status Test Passed");
    }

    // Test 4: Verify student eligibility
    @Test
    public void verifyEligibility() {

        int age = 20;

        Assert.assertTrue(age >= 18);

        System.out.println("Student Eligibility Test Passed");
    }
}
