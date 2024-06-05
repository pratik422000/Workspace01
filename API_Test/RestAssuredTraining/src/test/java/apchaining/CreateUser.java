package apchaining;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import com.github.javafaker.Faker;

public class CreateUser {

	@Test
	void test_CreateUser(ITestContext context) {
		Faker faker=new Faker();
		
		JSONObject data=new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender", "male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "inactive");
		
		String bearrerToken = "a7c0f43fb7c49b1694166e2b63df20ea31916caf840904042b57e997829abfc8";
		
		int id = given()
		.headers("Authorization","Bearer "+bearrerToken)
		.contentType("application/json")
		.body(data.toString())
		
		.when().post("https://gorest.co.in/public/v2/users")
		.jsonPath().getInt("id");
		
		System.out.println("Generated id is: "+id);
	//	context.setAttribute("user_id", id); // with this approach the variable is limited to the test level
		context.getSuite().setAttribute("user_id", id); // This will available at suite level;
	}
}
