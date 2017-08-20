package com.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tutorialpoint.TestJunit;
import com.tutorialpoint.TestOne;
import com.tutorialpoint.TestTwo;

/*
 * second option to run test is just press right button on test class an hit run ass Juint...
 */




public class MyTestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(TestJunit.class);
		 for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());

	}

}
