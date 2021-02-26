package com.pyxispm.Framework.APIs;

import static io.restassured.RestAssured.given;

import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;

public class UserAPI extends BaseTest{
	public static Response getRequestToGetUserDetails() {
		Response response = given().header("Authorization",config.getProperty("authKey") ).param("Authorization", config.getProperty("authKey")).
				get(config.getProperty("userAPIEndPoint"));
		return response;
	}
}
