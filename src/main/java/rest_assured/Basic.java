package rest_assured;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURL="http://127.0.0.1:8000";
		//given().header("content-type","application/json");
	}

}
