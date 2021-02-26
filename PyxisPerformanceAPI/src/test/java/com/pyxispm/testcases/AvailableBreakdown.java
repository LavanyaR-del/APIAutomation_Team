package com.pyxispm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pyxispm.Framework.APIs.AvailableBreakdownAPI;
import com.pyxispm.Framework.APIs.ClientAPI;
import com.pyxispm.listeners.ExtentListeners;
import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;

@Test
public class AvailableBreakdown extends BaseTest{
	public void AvailableBreakdown() {
	Response response = AvailableBreakdownAPI.getAvailableBreakdown();	
	ExtentListeners.testReport.get().info(response.prettyPrint());
	
	System.out.println("Status code for Client API = " + response.statusCode());
	System.out.println(response.getBody());
	
	Assert.assertEquals(response.statusCode(), 200);
	
}

}
