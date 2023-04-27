package com.java.p;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class lll {
	@Test(dataProvider="dp")
	public void hh4(int a, int b) {
		SoftAssert hh=new SoftAssert();
		hh.assertEquals(0, 0, "fffffffff");
		Assert.assertEquals(0, 0, "fffffffff");
		
		hh.assertAll();
		System.out.println("test 4");
	}
	
	
	
	@DataProvider
	public Object[][] dp(){
		return new Object [][]{
			{0,1},
			{0,2}};
		
	}
}


