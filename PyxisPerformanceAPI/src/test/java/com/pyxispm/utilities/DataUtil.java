package com.pyxispm.utilities;

import org.testng.annotations.DataProvider;

import com.pyxispm.setUp.BaseTest;
import com.sun.org.apache.bcel.internal.classfile.Method;

public class DataUtil extends BaseTest{
	
	@DataProvider(name="getData")
	public Object[][] getData(Method m) {
		//String sheetName = "userLogin";
		//method name should be name of the sheet so that the data get spicked up properly
		String sheetName = m.getName();
		
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		//rows-1 because of header
		Object[][] data = new Object[rows-1][cols];
		//data[0][0]="test@aiquire.com";
		//data[0][1]="123456";
		
		//read data from excel
		data[0][0] = excel.getCellData(sheetName, 0, 2); // "test@aiquire.com"
		data[0][1] = excel.getCellData(sheetName, 1, 2); // "123456"
		
		
		/*
		 * multiple values
		 * for(int rowNum=2 ; rowNum<=rows ; rowNum++){
		 * 		for(int colNum=0 ; colNum<cols ; colNum++){
		 * 			data[rowNum-1][colNum] = excel.getCellData(sheetName, colNum, rowNum);
		 * 		}
		 * }
		 */
		
		//iterate for multiple records
		
		 
		return data;
	}
	
}
