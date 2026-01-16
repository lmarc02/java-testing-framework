package com.company.api.Test.UserClient;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {
    private final String baseUri;

    public UserClient(String baseUri) {
        this.baseUri = baseUri;
    }


    public Response getUserClient(Integer id){
        Response response = given()
                .baseUri(baseUri)
                .contentType("application/json")
                .when().get("/user/" + id);

        return response;
    }
}
