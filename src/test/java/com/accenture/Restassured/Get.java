package com.accenture.Restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get {

//	@Test
	public void getdata() {
		RestAssured.given().get("https://reqres.in/api/users?page=2").then().statusCode(200	).log().body();
	}
	
//	@Test
	public void queryParameter() {
		RestAssured.given().queryParam("page", 2).get("https://reqres.in/api/users").then().statusCode(200).log().body();
	}
	
	@Test
	public void pathParameter() {
		RestAssured.given().pathParam("id",2).get("https://reqres.in/api/users/{id}").then().statusCode(200).log().body();
	}
}
