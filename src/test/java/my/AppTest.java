package my;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AppTest {

    @Test
    public void testDeny() {
        given()
          .when().get("/app/deny")
          .then()
             .statusCode(401);
    }

}