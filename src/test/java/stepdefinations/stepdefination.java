package stepdefinations;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepdefination {

    RequestSpecification request;
    Response response;

    @Given("Add place Payload with get")
    public void add_place_payload() {

        request = given()
                .log().all()
                .contentType("application/json");
    }

    @When("User calls with http request")
    public void user_calls_with_http_request() {

        response = request
                .when()
                .get("https://restful-booker.herokuapp.com/booking");
    }

    @Then("validate the points")
    public void validate_the_points() {

        response.then()
                .log().all()        // ✅ prints response
                .statusCode(200);

        System.out.println(response.asString()); // ✅ prints body as string
    }
    
    @Given("Add place Payload with body with post_")
    public void Add_place_Payload_with_body_with_post_ () {

    	 request=given().log().all().contentType("application/json").accept("application/json")
    	.body(" {\r\n"
    			+ "    \"firstname\" : \"Harshada\",\r\n"
    			+ "    \"lastname\" : \"Mathane\",\r\n"
    			+ "    \"totalprice\" : 111,\r\n"
    			+ "    \"depositpaid\" : true,\r\n"
    			+ "    \"bookingdates\" : {\r\n"
    			+ "        \"checkin\" : \"2018-01-01\",\r\n"
    			+ "        \"checkout\" : \"2019-01-01\"\r\n"
    			+ "    },\r\n"
    			+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
    			+ "}");
    }

    @When("User calls with http request with_post")
    public void User_calls_with_http_request_with_post() {
    	//RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        response = request
    	.when().post("https://restful-booker.herokuapp.com/booking");
    }

    @Then("validate the points with post")
    public void validate_the_points_with_post() {

        response.then().assertThat().statusCode(200)
         .log().all();	

        System.out.println(response.asString()); // ✅ prints body as string
    }
 
    
}
