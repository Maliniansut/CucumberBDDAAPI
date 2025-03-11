package step.definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DemoRestAPI {

    @Given("create a user with {string} with {string} and {string}")
    public void createUser(String url, String user, String pass) {
        // Implementation of API request to create a user
        System.out.println("Creating user at URL: " + url + " with Username: " + user + " and Password: " + pass);
    }

    @Then("Response code should be {string}")
    public void verifyResponseCode(String responseCode) {
        // Implementation to verify the response code
        System.out.println("Expected Response Code: " + responseCode);
    }
}


