package day1;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CookiesAndHeadersDemo {

	@Test(enabled=false)
	void testCookies() {
		
		given()
		
		.when()
			.get("https://www.google.com")
		.then()
		.cookie("AEC","Ae3NU9MkI5TUhOqsMY5hi4oP49IQ7b7qIcFhAe__Tm9GgAzFiabpbnqmbAs").log().all();
	}

	@Test(enabled=false)
	void getCookiesInfo() {
			
		Response res=given()
			
		.when()
			.get("https://www.google.com");
			
//		//get single cookie info
//		String cookie_value= res.getCookie("AEC");
//		System.out.println("value of cookie is ==>"+cookie_value);
			
		Map<String,String>cookies_values= res.getCookies();		
		System.out.println(cookies_values.keySet()); //.keySet method gives all the information of keys only.
			
		for(String k:cookies_values.keySet())
		{
			String cookie_value=res.getCookie(k);
			System.out.println(k+"             "+cookie_value);
		}
	}
		
	@Test(enabled=false)
	void testheaders() {
			
		given()
			
		.when()
			.get("https://www.google.com")
		.then()
			.header("Content-Type", "text/html; charset=ISO-8859-1").and()
			.header("Content-Encoding","gzip");
	}
		
	@Test(enabled=false)
	void getHeaders() {
		
		Response response=given()
				
				.when()
					.get("https://www.google.com");
		//get single header info
		String headerValue=response.getHeader("Content-Type");
		System.out.println("The value of content type header is:" +headerValue);
		
		//get all headers info
		Headers allheaders=response.getHeaders();
		
		for(Header hd:allheaders) 
		{
			System.out.println(hd.getName()+"     "+hd.getValue());
		}
	//This is not used that much because when we do.log().all(); it will by defaults gives headers along with all information.
		
	}
	
	@Test
	void testlogs() {
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=1")
		.then()
			.log().body()   //This will log only body from response
			.log().cookies()  //This will log only cookies from response
			.log().headers() //This will log only headers from response
			.log().all();  //This will log whole response
	}
}
