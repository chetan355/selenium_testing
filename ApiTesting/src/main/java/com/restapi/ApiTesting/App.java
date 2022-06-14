package com.restapi.ApiTesting;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// given() -all input details 
    	// when()-submit the API
    	//then()-validate the response
    	RestAssured.useRelaxedHTTPSValidation();
    	
    	RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    	given().params("userId",2)
    	.when().get("/posts")
    	.then().log().all().assertThat().statusCode(200);
    	
    	
    }
}
