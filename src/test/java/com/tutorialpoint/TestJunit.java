package com.tutorialpoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	
	
	protected void setUp(){
		
	}
	/*
	 * method with @Test annotation will be test method
	 */
	@Test
	public void addTest(){
		String txt = "Junit is working";
		assertEquals("Junit is working",txt);
	}
	
}
