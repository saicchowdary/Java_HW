package Week7;


public class Day2_Task1_PostmanPOST {

    public static void main(String[] args) {

        System.out.println("Week 7 Day 2 - Task 1");
        System.out.println("POST Request Practice");

        System.out.println("API URL:");
        System.out.println("https://jsonplaceholder.typicode.com/posts");

        System.out.println("HTTP Method: POST");

        System.out.println("Request Body:");
        System.out.println("{");
        System.out.println("  \"title\": \"QA Automation\",");
        System.out.println("  \"body\": \"Learning API Testing\",");
        System.out.println("  \"userId\": 1");
        System.out.println("}");

        System.out.println("Expected Status Code: 201 Created");

    }
}
