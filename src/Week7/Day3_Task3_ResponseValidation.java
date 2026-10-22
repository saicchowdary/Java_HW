package Week7;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Day3_Task3_ResponseValidation {

    public static void main(String[] args) {

        Response response = RestAssured.get(
                "https://jsonplaceholder.typicode.com/users/1"
        );

        String name = response.jsonPath().getString("name");

        System.out.println("User Name: " + name);

        if (name.equals("Leanne Graham")) {
            System.out.println("Response Validation PASSED");
        } else {
            System.out.println("Response Validation FAILED");
        }
    }
}
