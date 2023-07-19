package automation.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Besic {

	public static void main(String[] args) {
		RestAssured.baseURI="http://127.0.0.1:8000";
		given().log().all().when().get("api/viewcustomer")
		.then().log().all().assertThat().statusCode(200);		
		// agr access token send krna h to
		// given().headers("authorize",tokenValue, "content-type","application/json")
	}

}
