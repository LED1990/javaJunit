package com.tutorialpoint;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * Test suites - allows to run test together
 * Two annotations enables that: @RunWith and @SuiteClasses({class1, class2....})
 */
@RunWith(Suite.class) //Suite is class from JUnit
@SuiteClasses({TestOne.class,TestTwo.class})

public class TestTestSuite {

}
