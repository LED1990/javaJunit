package com.tutorialpoint;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mymain.TestMe;

/*
 * this class is testing method in TestMe.class
 */
public class TestTestMe {
	
	String msg = "hello";
	TestMe tm = new TestMe("not hello");
	
	@Test
	public void testGetMsg(){
		assertEquals(msg,tm.getMsg());
	}

}
