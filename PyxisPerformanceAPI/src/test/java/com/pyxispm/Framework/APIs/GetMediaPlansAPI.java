package com.pyxispm.Framework.APIs;

import static io.restassured.RestAssured.given;

import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;

public class GetMediaPlansAPI extends BaseTest{
	
	public static Response sendGetRequestToGetMediaPlans() {
		
		Response response = given().header("Authorization", config.getProperty("authKey")).param("Authorization", config.getProperty("authKey")).
				get(config.getProperty("getMediaPlansEndPoint"));
		
		return response;
	}
	
}
