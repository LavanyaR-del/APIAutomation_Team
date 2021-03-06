package com.pyxispm.Framework.APIs;

import static io.restassured.RestAssured.given;

import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;

	public class ClientAPI extends BaseTest{
		
		public static Response getClient() {
			
			Response response = given().header("Authorization", config.getProperty("authKey")).param("Authorization", config.getProperty("authKey")).formParam("start_date", config.getProperty("clientStartDate")).formParam("end_date", config.getProperty("clientEndDate")).formParam("stories", config.getProperty("clientStories")).formParam("source", config.getProperty("clientSource")).
					get(config.getProperty("clientEndPoint"));
			
			return response;
		}
}
