package Week7;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Day3_Task1_RESTAssuredSetup {

    public static void main(String[] args) {

        Response response = RestAssured.get(
                "https://jsonplaceholder.typicode.com/users/1"
        );

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
