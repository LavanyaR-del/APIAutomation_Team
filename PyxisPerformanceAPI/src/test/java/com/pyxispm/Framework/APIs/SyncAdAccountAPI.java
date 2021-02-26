package com.pyxispm.Framework.APIs;

import static io.restassured.RestAssured.given;

import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;

public class SyncAdAccountAPI extends BaseTest{
	
	public static Response sync() {
		
		Response response = given().header("Authorization", config.getProperty("authKey")).param("Authorization", config.getProperty("authKey")).formParam("ad_accounts", config.getProperty("sync_ad_accounts")).formParam("skip_paused", config.getProperty("sync_skip_paused")).
				post(config.getProperty("syncAdAccountEndPoint"));
		
		return response;
	}

}
