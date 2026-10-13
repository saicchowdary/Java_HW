package Week6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1_Task1_BankTestNG {

    // Test 1: Verify account balance
    @Test
    public void checkBalance() {

        int expectedBalance = 5000;
        int actualBalance = 5000;

        Assert.assertEquals(actualBalance, expectedBalance);

        System.out.println("Balance Test Passed");
    }

    // Test 2: Verify money deposit
    @Test
    public void depositMoney() {

        int balance = 5000;
        int deposit = 2000;

        int totalBalance = balance + deposit;

        Assert.assertEquals(totalBalance, 7000);

        System.out.println("Deposit Test Passed");
    }

    // Test 3: Verify money withdrawal
    @Test
    public void withdrawMoney() {

        int balance = 5000;
        int withdrawal = 1000;

        int remainingBalance = balance - withdrawal;

        Assert.assertTrue(remainingBalance >= 0);

        System.out.println("Withdrawal Test Passed");
    }
}
