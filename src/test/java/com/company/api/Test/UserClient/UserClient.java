package com.company.api.Test.UserClient;

import com.company.api.Test.BaseTest.RequestSpecFactory;
import com.company.api.Test.Utils.ConfigReader;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {
    private final String baseUri;

    public UserClient(String baseUri) {
        this.baseUri = baseUri;
    }

    public Response getUserClient(Integer id) {
         String xApiKey = System.getProperty("xApiKey");
        Response response = given()
                .spec(RequestSpecFactory.getSpec())
                .header("x-api-key", xApiKey)
                .when()
                .get("/user/" + id);

        return response;
    }
}
