//package restAssured;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.awt.List;
//
////import java.util.List;
//
//import org.junit.jupiter.api.Test;
//
//import io.restassured.RestAssured;
//import io.restassured.http.Header;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
//import io.restassured.specification.RequestSpecification;
//
//class RestAssuredTest {
//
//	@Test
//	void test() {
//		RestAssured.baseURI="http://api.genderize.io/";
//		RequestSpecification myRequest=RestAssured.given();
//		myRequest.queryParam("name", "Navya");
//		Response response=myRequest.get("");
//		int statusCode=response.getStatusCode();
//		assertEquals(200, statusCode);
//		System.out.println(response.getStatusLine());
//		assertEquals("HTTP/1.1 200 OK",response.getStatusLine());
//		response.headers();
//		for(Header hd:response.headers()) {
//			System.out.println("name:="+hd.getName());
//			System.out.println("value:="+hd.getValue());
//		}
//		ResponseBody resBody=response.getBody();
//		JsonPath responsePath=response.jsonPath();
//		String myName=responsePath.get("name");
//		assertEquals("Navya",myName);
//		
//	}
//	
//	void test2() {
//		RestAssured.baseURI="http://universities.hipolabs.com/search/";
//		RequestSpecification myRequest=RestAssured.given();
//		myRequest.queryParam("country", "india");
//		Response response=myRequest.get("");
//		int StatusCode=response.getStatusCode();
//		assertEquals(200, StatusCode);
//		JsonPath responsePath=response.jsonPath();
//		List<String> countries=responsePath.getList("country");
//		List<String> names=responsePath.getList("name");
//		List<String> states=responsePath.getList("state-province");
//		for(int i=0;i<names.size)
//	}
//	
//}
