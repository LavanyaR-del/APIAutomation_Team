package com.pyxispm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pyxispm.Framework.APIs.ClientAPI;
import com.pyxispm.listeners.ExtentListeners;
import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;
@Test
public class Client extends BaseTest{
		public void Client() {
		Response response = ClientAPI.getClient();	
		ExtentListeners.testReport.get().info(response.prettyPrint());
		
		System.out.println("Status code for Client API = " + response.statusCode());
		System.out.println(response.getBody());
		
		Assert.assertEquals(response.statusCode(), 200);
		
	}
}
