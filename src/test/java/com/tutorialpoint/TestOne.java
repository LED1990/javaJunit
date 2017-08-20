package com.tutorialpoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOne {
	
	@Test
	public void testMsg(){
		String txt = "Junit is working";
		assertEquals("Junit is working",txt);
	}
}
