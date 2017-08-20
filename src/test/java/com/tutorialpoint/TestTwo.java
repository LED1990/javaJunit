package com.tutorialpoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTwo {
	
	@Test
	public void testMsg(){
		String txt = "Junit is working";
		assertEquals("Junit is working",txt);		
	}
	
}
