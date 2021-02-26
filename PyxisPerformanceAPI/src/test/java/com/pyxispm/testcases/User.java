package com.pyxispm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pyxispm.Framework.APIs.UserAPI;
import com.pyxispm.listeners.ExtentListeners;

import io.restassured.response.Response;

public class User {
	@Test
	public void getUserDetails() {

		Response response = UserAPI.getRequestToGetUserDetails();
		ExtentListeners.testReport.get().info(response.prettyPrint());
		
		System.out.println("Status code for User API = "+response.statusCode());
		
		Assert.assertEquals(response.statusCode(), 200, "User details successfully fetched!");
	}

}
