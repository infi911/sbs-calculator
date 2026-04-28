package com.infi911.sbs;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class FinancialCalendarResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/financial-calendar")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST"));
    }

}