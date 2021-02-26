package com.pyxispm.testcases;

import org.openqa.selenium.remote.ResponseCodec;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pyxispm.Framework.APIs.LoginAPI;
import com.pyxispm.Framework.APIs.UserAPI;
import com.pyxispm.listeners.ExtentListeners;
import com.pyxispm.setUp.BaseTest;
import com.pyxispm.utilities.DataUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import javax.sound.sampled.TargetDataLine;

public class Login extends BaseTest{
	
	@Test(priority = 1)
	public void Login() {

		Response response = LoginAPI.sendPostRequestToLoginWithValidCredentials();
		ExtentListeners.testReport.get().info(response.prettyPrint());
		
		System.out.println("Status for Login API = " +response.statusCode());
		System.out.println(response.getBody());
		
		String authKey = response.jsonPath().get("data.key");
		this.authKey = "Token "+authKey;
		System.out.println(authKey);
		
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	//Remove comment from annotation if you want to test for multiple users
	/*
	 * @Test(dataProviderClass = DataUtil.class, dataProvider = "getData")
	 
	public void multipleUserLogin(String email, String password) {
		
							
		Response response = given().auth().basic(config.getProperty("token"), "")
							.formParam("email", email).formParam("password", password)
							.post(config.getProperty("loginAPIEndPoint"));
									
		response.prettyPrint();
		System.out.println(response.statusCode());
		
		//Assert.assertEquals(response.statusCode(), 200);
	}
	*/


}
