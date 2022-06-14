package com.restapi.ApiTesting;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test1 {
	
	@Test
	public void test() {
    	RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";
    	given().params("userId",2)
    	.when().get("/posts")
    	.then().log().all().assertThat().statusCode(200);		
	}
}
