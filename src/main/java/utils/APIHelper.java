package utils;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class APIHelper {

    public static Response postRequest(String url, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(url);
    }
}

