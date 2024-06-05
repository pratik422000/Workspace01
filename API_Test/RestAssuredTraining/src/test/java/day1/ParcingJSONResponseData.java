package day1;

import static io.restassured.RestAssured.*;


import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParcingJSONResponseData {

	// Parcing= we can traverse throught the json response to get required fields or required data format the json.
	//Q. how to parse JSON response data ==> Ans: by using JSONObject class.
	@Test(enabled=false)
	void testJsonResponse() {
		// Approach 1

//		given().contentType("ContentType.JSON")
//		.when().get("https://reqres.in/api/users?page=1")
//		.then().statusCode(200)
//			.header("Content-Type", "application/json; charset=utf-8")
//			.body("data[4].last_name", equalTo("Morris"));

		// Approach 2

		Response response = given().contentType("ContentType.JSON").when().get("https://reqres.in/api/users?page=1");

		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		String lastname = response.jsonPath().get("data[4].last_name").toString(); // The .get() method returns the
																					// value in object format
		// If the value is in object format we can't do any other validations, because
		// for validations we want exactly primitive value (string, integer)
		Assert.assertEquals(lastname, "Morris");
	}
	
	
	@Test(enabled=false)
	void testJsonResponseBodyData() {

		// Approach 2

		Response response = 
		given()
			.contentType(ContentType.JSON)
		.when()
			.get("https://reqres.in/api/users?page=1");

//		Assert.assertEquals(response.getStatusCode(), 200);
//		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
//		String lastname = response.jsonPath().get("data[4].last_name").toString(); // The .get() method returns the value in object format
//		// If the value is in object format we can't do any other validations, because
//		// for validations we want exactly primitive value (string, integer)
//		Assert.assertEquals(lastname, "Morris");
		
		//Using JSONObject class
		//Why we are using JSONobjectclass?
		//Ans:- suppose the data is dynamically displaying or data is not displaying in same order every time in those cases we can't very specific field in the specific position. In this case JSON path does not work.
		
		JSONObject jo=new JSONObject(response.asString()); // converting response to JSON object type.
		
//		for(int i=0; i<jo.getJSONArray("data").length();i++) 
//		{
//			String data_firstname=jo.getJSONArray("data").getJSONObject(i).get("first_name").toString();
//			System.out.println(data_firstname);
//		}
		
		// Search for firstname of the user in json
		boolean status=false;
		
		for(int i=0; i<jo.getJSONArray("data").length();i++) 
		{
			String data_firstname=jo.getJSONArray("data").getJSONObject(i).get("first_name").toString();
			if (data_firstname.equals("Charles"))
			{
				status=true;
				break;
			}
		}
		Assert.assertEquals(status, true);
		
		
	}
	
	@Test
	void validationOfResponseBody() {
		
		Response response =
		given()
		.when().get("https://fakestoreapi.com/products");
		JSONArray jrr=new JSONArray(response.asString());
		
		double totalprice=0;
		
		for(int i=0; i<jrr.length();i++) 
		{
			String price=jrr.getJSONObject(i).get("price").toString();
			totalprice=totalprice+Double.parseDouble(price);
		}
		
		System.out.println("total price of products is:"+ totalprice);
		
		
	}
	

}
