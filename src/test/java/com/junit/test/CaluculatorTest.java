package com.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.Caluculator;

public class CaluculatorTest {

	
	public static  Caluculator c;
	
	@BeforeClass
	public static void initializationMethod() {
		c=new Caluculator();
	}
	
	@AfterClass
	public static void desrtroyOrdemolioshMethod() {
		c=null;
	}
	
	@Test
	public void testSum()
	{
	
		Integer actualResult = c.sun(10, 200);
		Integer expectedResult=210;
		assertEquals(expectedResult, actualResult);
	}	
	
	@Test
	public void testProduct() {
		
		Integer actual = c.product(10, 10,10);
		Integer expected=1000;
		assertEquals(expected, actual);
	}
	
}
