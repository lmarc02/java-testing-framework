package com.company.api.Test;

import com.company.api.Test.BaseTest.BaseTest;
import com.company.api.Test.Listeners.TestListener;
import com.company.api.Test.UserClient.UserClient;
import com.company.api.Test.Utils.ConfigReader;
import com.company.api.Test.Utils.DataProviders;
import com.company.api.Test.Utils.PollingUtils;
import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners({ TestListener.class})
public class GetUserTest extends BaseTest {


    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser(Integer userId, String name) throws InterruptedException {
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser2(Integer userId, String name) throws InterruptedException {
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        //Response response = userClient.getUserClient(1);
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)

    public void getUser3(Integer userId, String name) throws InterruptedException {
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        //Response response = userClient.getUserClient(1);
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser4(Integer userId, String name) throws InterruptedException {
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        //Response response = userClient.getUserClient(1);
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser5(Integer userId, String name) throws InterruptedException {
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        //Response response = userClient.getUserClient(1);
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }
}
