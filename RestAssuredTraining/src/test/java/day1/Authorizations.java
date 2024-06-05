package day1;

import static io.restassured.RestAssured.*;
import com.github.javafaker.Faker;
import org.json.JSONObject;
import org.testng.annotations.Test;


public class Authorizations {
	
	@Test
	void GetBarrerToken() {
		
		Faker faker=new Faker();	
		JSONObject data=new JSONObject();
		data.put("clientName",faker.name().firstName());
		data.put("clientEmail",faker.internet().emailAddress());
		
		String accessToken = given()
				.body(data.toString())
				.contentType("application/json")
		
		.when().post("http://simple-books-api.glitch.me/api-clients/")
		.jsonPath().getString("accessToken");
	
		
		
		System.out.println("Generated access token is:"+accessToken);
		
		
		
	}
	
	
}
