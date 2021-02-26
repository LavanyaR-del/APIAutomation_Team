package com.pyxispm.Framework.APIs;

import static io.restassured.RestAssured.given;

import com.pyxispm.setUp.BaseTest;
import io.restassured.response.Response;

public class LoginAPI extends BaseTest{
	
	public static Response sendPostRequestToLoginWithValidCredentials() {
		String email = config.getProperty("email");
		String password = config.getProperty("password");
		
		Response response = given().auth().basic(config.getProperty("token"), "")
				.formParam("email", email).formParam("password", password)
				.post(config.getProperty("loginAPIEndPoint"));
		
		return response;
	}
	

}
