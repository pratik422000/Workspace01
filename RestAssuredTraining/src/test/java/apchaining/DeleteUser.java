package apchaining;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteUser {

	@Test
	void test_deleteUser(ITestContext context) {
		
		String bearrerToken = "a7c0f43fb7c49b1694166e2b63df20ea31916caf840904042b57e997829abfc8";
		
//		int id=(int) context.getAttribute("user_id"); 
		int id=(int) context.getSuite().getAttribute("user_id");
		
		given()
			.headers("Authorization","Bearer "+bearrerToken)
			.pathParam("id", id)
		
		.when()
			.delete("https://gorest.co.in/public/v2/users/{id}")
		.then()
			.statusCode(204)
			.log().all();
	}
}
