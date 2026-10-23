



## Week 4 Day 5 - Mini Selenium Flow

### Task 1 - Mini Selenium Flow
- Open Chrome browser
- Navigate to SauceDemo website
- Enter username and password
- Click the Login button
- Verify successful login
- Close the browser

### Task 2 - Code Cleanup
Created reusable methods:
- openBrowser()
- openWebsite()
- login()
- verifyLogin()
- closeBrowser()

### Selenium Setup
1. Install Java JDK
2. Install IntelliJ IDEA
3. Add Selenium dependencies
4. Install Google Chrome
5. Run the Selenium Java class

### Execution
Run:
- Day5_Task1_MiniFlow.java
- Day5_Task2_Refactor.java

Expected Result:
Login Test Passed





# Java_HW
“In this Java program, I practiced conditions, loops, methods, and validation. First, I used an if-else condition to check whether the username is admin. If it matches, it prints ‘Login Successful’; otherwise, it prints ‘Login Failed’. Second, I used a for loop to run three test cases. Finally, I created a reusable method called checkResult() that compares the expected result with the actual result. If both values are equal, the test passes; otherwise, it fails. This program helped me understand basic Java concepts used in QA automation.”

Easy way to remember for examiner:

Condition → Login check → Loop → Run tests → Method → Compare results → Pass/Fail.## Week 2 - Java Concepts

During Week 2, I learned and practiced:

- Arrays
- Array Traversal
- Array Search
- Strings
- String Validation
- String Comparison
- Classes and Objects
- Constructors
- Inheritance
- Method Overriding
- Polymorphism
- Encapsulation
- QA Scenario Class Design


---

## Week 5 Day 5 - Mini Project 1

### Project Name
Login Automation Using Selenium WebDriver

### Task 1 - Login Mini Project
- Launch Chrome browser
- Open login page
- Enter username and password
- Click Login button
- Validate successful login
- Capture screenshot
- Verify logout button
- Click Logout
- Validate successful logout
- Close browser

### Technologies Used
- Java
- Selenium WebDriver
- Maven
- IntelliJ IDEA
- Chrome Browser

### Test Website
https://the-internet.herokuapp.com/login

### Test Credentials
Username: tomsmith

Password: SuperSecretPassword!

### Execution Steps
1. Open Java_HW project in IntelliJ IDEA.
2. Open Day5_LoginMiniProject.java.
3. Right-click the Java class.
4. Select Run.
5. Verify the console output.
6. Check the screenshots folder.

### Assumptions
- Java and Maven are configured.
- Selenium dependencies are available.
- Chrome browser is installed.
- Internet connection is available.
- The practice website is accessible.

### Validations
1. Verify successful login message.
2. Verify screenshot is captured.
3. Verify logout button is displayed.
4. Verify successful logout.
5. Verify browser closes.

### Expected Result
TEST PASSED: Login Successful
Screenshot Captured Successfully
Logout Button Displayed
TEST PASSED: Logout Successful

### Conclusion
Successfully automated login and logout functionality
using Selenium WebDriver and Java.





## Week 6 Day 5 - Mini Project 2

Created a login automation framework using:
- Selenium WebDriver
- Java
- TestNG
- Page Object Model (POM)

Includes valid and invalid login tests.

Documentation:
[src/Week6/Week6/Day5_Task2_Readme.md](src/Week6/Week6/Day5_Task2_Readme.md)



## Week 7 Day 4 - API Automation

### Task 1: API Test Cases
- Positive Test: Verify status code 200 for a valid user.
- Negative Test: Verify status code 404 for an invalid user.

### Task 2: Combined Assertions
- Validate API status code 200.
- Validate user ID = 1.
- Validate username = Bret.

### Task 3: API Documentation
- Endpoint: https://jsonplaceholder.typicode.com/users/1
- Method: GET
- Request Body: Not required
- Expected Status Code: 200
- Expected Username: Bret

### Tools Used
- Java
- REST Assured
- TestNG
- IntelliJ IDEA