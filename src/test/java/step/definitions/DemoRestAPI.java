package step.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

public class DemoRestAPI {
    private Response response;

    @Given("create a user with {string} with {string} and {string}")
    public void createUser(String url, String user, String pass) {
        response = given()
                .header("Content-Type", "application/json")
                .body("{ \"email\": \"" + user + "\", \"password\": \"" + pass + "\" }")
                .when()
                .post(url);

        System.out.println("Response: " + response.asPrettyString());
    }

    @Then("Response code should be {string}")
    public void verifyResponseCode(String responseCode) {
        Assert.assertEquals(response.getStatusCode(), Integer.parseInt(responseCode));
    }
}




