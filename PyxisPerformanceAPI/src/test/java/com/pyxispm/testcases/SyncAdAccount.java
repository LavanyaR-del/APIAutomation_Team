package com.pyxispm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pyxispm.Framework.APIs.ClientAPI;
import com.pyxispm.Framework.APIs.SyncAdAccountAPI;
import com.pyxispm.listeners.ExtentListeners;
import com.pyxispm.setUp.BaseTest;

import io.restassured.response.Response;

@Test
public class SyncAdAccount extends BaseTest{
	public void SyncAdAccount() {
	Response response = SyncAdAccountAPI.sync();	
	ExtentListeners.testReport.get().info(response.prettyPrint());
	
	System.out.println("Status code for Client API = " + response.statusCode());
	System.out.println(response.getBody());
	
	Assert.assertEquals(response.statusCode(), 200);
	
}

}
