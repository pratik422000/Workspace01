package day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
/*
 * given()
 * 	content type, set cookies, add auth, add param, set headers information etc....
 * 
 * when()
 * 	get, post, put, delete.
 * 
 * then()
 * 	validate status code, extract response, extract header, cookies and response body...
 */

public class HTTPRequests {

	int id;

	@Test(priority = 1)
	void getusers() {

		given()

				.when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("page", equalTo(2)).log()
				.all();
	}

	@Test(priority = 2)
	void createuser() {
		HashMap data = new HashMap();
		data.put("name", "pratik");
		data.put("job", "engineer");

		id = given().contentType("application/json").body(data).when().post("https://reqres.in/api/users").jsonPath()
				.getInt("id");
//				.then()
//				.statusCode(201)
//				.log().all();
	}

	@Test(priority = 3, dependsOnMethods = { "createuser" })
	void updateuser() {

		HashMap data = new HashMap();
		data.put("name", "Neha");
		data.put("job", "Doctor");

		given().contentType("application/json").body(data)

				.when().put("https://reqres.in/api/users/" + id)

				.then().statusCode(200).log().all();
	}

	@Test(priority = 4)
	void deleteUser() {

		given()

				.when().delete("https://reqres.in/api/users/" + id)

				.then().statusCode(204).log().all();
	}

}
