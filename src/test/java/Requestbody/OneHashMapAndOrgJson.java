package Requestbody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.util.HashMap;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class OneHashMapAndOrgJson
{
	int id;
     
	@Test(priority=1)
	void PostBodyHashmapRequest()
	{
		
		HashMap data = new HashMap();
		data.put("name", "harshada");
		data.put("job","Support engineer");
		String courseArr[] = {"a","b"};
		data.put(data, courseArr);		
		given()
		.contentType("application/json")
		.body(data)		
		.when()
		.post("https://reqres.in/api/users/")		
	.then()
			.statusCode(201)
			.body("name", equalTo("harshada"))
			.body("job", equalTo("Support engineer"))
		//	.body("course[0]", equalTo(" "))
		//	.body("course[1]", equalTo("b"))
			.log().all()
	.extract()
	 .jsonPath().getInt("id");
	}
	@Test(priority=2)
	void Deletehttp()
	{
	
		given()

		
		.when()
		 .delete("https://reqres.in/api/users/"+id)
		
		.then()
			.statusCode(204)
			.log().all();
	}
	@Test(priority=3)
	void PostBodyORGjson()
	{
		JSONObject data = new JSONObject();
		data.put("name", "chetan");
		data.put("job","engineer");
		String courseArr[] = {"d","e"};		
		data.put("course",courseArr);
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		 .post("https://reqres.in/api/users/")
		
		.then()
			.statusCode(201)
		.body("name", equalTo("chetan"))
			.body("job", equalTo("engineer"))
			.log().all();
	}

	
}
