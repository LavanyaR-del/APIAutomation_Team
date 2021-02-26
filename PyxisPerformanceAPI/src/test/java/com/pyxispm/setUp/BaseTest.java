package com.pyxispm.setUp;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.pyxispm.utilities.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseTest {
	
	public static Properties config = new Properties();
	private FileInputStream fis;
	public static ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
	public static String authKey;
	
	@BeforeSuite
	public void setUp() throws IOException {
		
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");	
		config.load(fis);
		
		
		RestAssured.baseURI = config.getProperty("baseURI");
		RestAssured.basePath = config.getProperty("basePath");
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
	}
	
}
