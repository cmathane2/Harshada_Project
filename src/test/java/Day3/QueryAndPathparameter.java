package Day3;
import org.testng.annotations.Test;
import static  io.restassured.RestAssured.* ;
import static  io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.Matchers.* ;
public class QueryAndPathparameter

{
	//https://reqres.in//api/users?page=2
	@Test
	void testQueryAndPathParameter()
	{		
		given()
		//.pathParam("Variable","fact")
		.queryParam("name","meelad")
		
		.when()
	//	https://api.agify.io?name=meelad
		.get("https://api.agify.io")
		//patha parameter variable used not query paramter
		.then()
		.statusCode(200)
		.log().all();		
	}
	

}
