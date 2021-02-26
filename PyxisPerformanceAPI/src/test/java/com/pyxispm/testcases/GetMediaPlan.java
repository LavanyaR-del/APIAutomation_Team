package com.pyxispm.testcases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pyxispm.Framework.APIs.GetMediaPlansAPI;
import com.pyxispm.listeners.ExtentListeners;
import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;

public class GetMediaPlan extends BaseTest{
	@Test
	public void getMediaPlan() {
		
			Response response = GetMediaPlansAPI.sendGetRequestToGetMediaPlans();	
			ExtentListeners.testReport.get().info(response.prettyPrint());
			
			System.out.println("Status code for Get Media Plans API = " + response.statusCode());
			System.out.println(response.getBody());
			
			Assert.assertEquals(response.statusCode(), 200, "Media Plans fetched successfully!!");
			
		}
	


}
