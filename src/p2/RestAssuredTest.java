package p2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredTest {
	
	void test() {
		RestAssured.baseURI="https://api.genderize.io/";
		RequestSpecification myRequest=RestAssured.given();
		myRequest.queryParam("name", "Navya");
		Response response=myRequest.get("");
		int statusCode=response.getStatusCode();
	}

}
