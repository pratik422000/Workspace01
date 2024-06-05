package apchaining;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser {

	@Test
	void test_updateUser(ITestContext context) {
Faker faker=new Faker();
		
		JSONObject data=new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender", "Female");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "active");
		
		String bearrerToken = "a7c0f43fb7c49b1694166e2b63df20ea31916caf840904042b57e997829abfc8";
//		int id=(int) context.getAttribute("user_id"); 
		int id=(int) context.getSuite().getAttribute("user_id");
		given()
		.headers("Authorization","Bearer "+bearrerToken)
		.contentType("application/json")
		.pathParam("id", id)
		.body(data.toString())
		
		.when().put("https://gorest.co.in/public/v2/users/{id}")
		
		.then().statusCode(200).log().all();
		
	}
}
