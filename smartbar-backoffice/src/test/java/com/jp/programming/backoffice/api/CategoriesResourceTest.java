package com.jp.programming.backoffice.api;

import io.quarkus.logging.Log;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class CategoriesResourceTest {

    @Test
    void getListOfCategories() {
        final Response response = given()
                .when().get("/categories")
                .then()
                .statusCode(200)
                .extract().response();

        Log.info("Response: %s".formatted(response.asString()));

        final JsonPath jsonPath = response.jsonPath();

        Assertions.assertEquals("drinks", jsonPath.getString("[0].name"));
    }
}
