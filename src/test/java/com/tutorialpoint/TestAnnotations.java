package com.tutorialpoint;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAnnotations {
	
	/*
	 * @Ignore - method with this annotation will not be executed!
	 * @Befoe/After Class - both methods with those annotations must be static. Both are done only once in test class. 
	 * @Before / @After - executes before and after each test method in the class.
	 */

	@BeforeClass
	public static void doBeforeC(){
		System.out.println("I am done before all tests in the class - BeforeClass");
	}
	@AfterClass
	public static void doAfterC(){
		System.out.println("I am done after all tests in the class - AfterClass");
	}
	@Before
	public void doBefore(){
		System.out.println("I am done before test method - Before");
	}
	@After
	public void doAfter(){
		System.out.println("I am done after each test method - After");
	}
	
	@Test
	//@Test(timeout = 1000)
	/*
	 * timeout is used when you want to check if test doesn't take to much time [ms]
	 */
	public void testOne(){
		System.out.println("test one");
	}
	@Test
	public void testTwo(){
		System.out.println("test two");
	}
}
