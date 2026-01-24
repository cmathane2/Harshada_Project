package Requestbody;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Pojo
{
	int id;
     @Test
	void POJO()
	{
		POJO_POST_Request data = new POJO_POST_Request();
        data.setName("Scott");
        String setJob = data.setJob("Fance");
    
    given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://reqres.in/api/users/")
		
		
	.then()
			.statusCode(403)
			.body("Name", equalTo("Scott"))
			.body("Job", equalTo("Fance"))
		//	.body("Phone", equalTo("55555555"))
		//	.body("course[0]", equalTo(" "))
		//	.body("course[1]", equalTo("b"))
			.log().all()
	.extract()
	 .jsonPath().getInt("id");
	}
	@Test
	void GetBookingIDs()
	{
	
	//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
	
	given().log().all().contentType("application/json")
	
    .when().get("https://restful-booker.herokuapp.com/booking/3995")
    .then()
    .assertThat().statusCode(200)
    //.body("bookingid[0]", equalTo("9135"))
    .log().all();				
	}
	@Test
	void GetBooking()
	{
	
	RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
	
	given().log().all().contentType("application/json")	
    .when()
    .get("https://restful-booker.herokuapp.com/booking/3995")
    .then()
    .assertThat().statusCode(200)
    .body("firstname", equalTo("Harshada"))
    .body("lastname",equalTo("Mathane"))
    .log().all();				
	}
	
	@Test
	void CreateBooking()
	{
	
	RestAssured.baseURI="https://restful-booker.herokuapp.com/";
	
	given().log().all().contentType("application/json").accept("application/json")
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
			+ "}")
    .when()
    .post("booking")
    .then()
    .assertThat().statusCode(200)
   // .body("firstname", equalTo("Jim"))
    //.body("lastname",equalTo("Brown"))
    .log().all();				
	}


	@Test
	void PutBooking()
	{
	
	RestAssured.baseURI="https://r estful-booker.herokuapp.com/";
	
	given().log().all().
	contentType("application/json").accept("application/json").pathParam("ID", 3995)
	
	.body(" {\r\n"
			+ "    \"firstname\" : \"Chetan\",\r\n"
			+ "    \"lastname\" : \"Mathane\",\r\n"
			+ "    },\r\n"
			+ "}")
	
    .when()
    .put("booking")
    .then()
    .assertThat().statusCode(200)
    .log().all();				
	}
	
}
