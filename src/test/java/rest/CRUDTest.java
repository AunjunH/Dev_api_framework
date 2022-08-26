package rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CRUDTest {

    private static final String apiHost = "https://gorest.co.in/public";
    private static final String apiVersion = "/v2";

    private static final String token = "0958864dd3f5b9cac67e0564b03444d7a9a1033897f724f1eff926f4f96ccdb0";

    public static void main(String[] args) {
        //Setting up baseUrl as in postman
        RestAssured.baseURI = apiHost + apiVersion;

        Response getResponse = RestAssured.given()
                .contentType(ContentType.JSON)
                .headers("Authorization", token)
                .accept(ContentType.JSON)
                .when()
                .get("/users");

        System.out.println(getResponse.asString());

    }
}
