package Week7;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Day3_Task2_GETValidation {

    public static void main(String[] args) {

        Response response = RestAssured.get(
                "https://jsonplaceholder.typicode.com/users/1"
        );

        int statusCode = response.getStatusCode();

        System.out.println("Status Code: " + statusCode);

        if (statusCode == 200) {
            System.out.println("GET Request Test PASSED");
        } else {
            System.out.println("GET Request Test FAILED");
        }
    }
}
