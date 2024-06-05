package apchaining;
import static io.restassured.RestAssured.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetUser {
	@Test
	void test_GetUser(ITestContext context) {
		
//		int id=(int) context.getAttribute("user_id"); // we are referring this as a test level
		int id=(int) context.getSuite().getAttribute("user_id");
		String bearrerToken = "a7c0f43fb7c49b1694166e2b63df20ea31916caf840904042b57e997829abfc8";
		
		given()
			.headers("Authorization","Bearer "+bearrerToken)
			.pathParam("id", id)
			
		.when().get("https://gorest.co.in/public/v2/users/{id}")
		
		.then().statusCode(200).log().all();
	}
}
