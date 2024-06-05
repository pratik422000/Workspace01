package api.tests;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payloads.User;
import io.restassured.response.Response;

public class UserTests {
	
	Faker faker;
	User userPayload;
	
	@BeforeClass
	public void setupData()
	{
		faker=new Faker();
		userPayload = new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5,10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
	}
	
	@Test(priority=1)
	public void testPostUser()
	{
		Response response= UserEndPoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=2)
	public void testGetUserByName()
	{
		Response response= UserEndPoints.readUser(this.userPayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority=3)
	public void testUpdateUserByName()
	{
		//update data using payload
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		
		Response response=UserEndPoints.updateUser(this.userPayload.getUsername(),userPayload);
		response.then().log().body().statusCode(200);    // assertion type 1
		response.then().log().body();
		Assert.assertEquals(response.getStatusCode(), 200); //assertion type 2
		
		// checking data after update
		
		Response responseAfterUpdate= UserEndPoints.readUser(this.userPayload.getUsername());
		responseAfterUpdate.then().log().all();
		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
	}
	
	@Test(priority=4)
	public void testDeleteUserByName()
	{
		Response response= UserEndPoints.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
