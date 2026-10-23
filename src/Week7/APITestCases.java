package Week7.Day4_Task1_APITestCases;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITestCases {

    @Test
    public void positiveTest() {

        RestAssured.given()
                .get("https://jsonplaceholder.typicode.com/users/1")
                .then()
                .statusCode(200);

        System.out.println("Positive Test Passed");
    }

    @Test
    public void negativeTest() {

        RestAssured.given()
                .get("https://jsonplaceholder.typicode.com/users/9999")
                .then()
                .statusCode(404);

        System.out.println("Negative Test Passed");
    }
}
