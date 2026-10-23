package Week7;


import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

public class APIAssertions {

    @Test
    public void testAPI() {

        RestAssured.given()
                .get("https://jsonplaceholder.typicode.com/users/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("username", equalTo("Bret"));

        System.out.println("API Test Passed");
    }
}
