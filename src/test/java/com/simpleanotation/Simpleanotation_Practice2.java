package com.simpleanotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simpleanotation_Practice2 {
	
//Before suite, before test and before class are one time execution
	//And rest of all are multiple time execution
	
@BeforeSuite
	public void grandfather() {
		System.out.println("@BeforeSuite:grandfather");

	}

@BeforeTest
public void grandmother() {
	System.out.println("@BeforeTest:grandmother");
}

@BeforeClass
public void father() {
	System.out.println("BeforeClass:father");

}
@BeforeMethod
public void mother() {
	System.out.println("BeforeMethod:mother");

}
@Test
public void child() {
	System.out.println("@Test:Test1");

}
@Test
public void brother1() {
	System.out.println("@Test:Test2");

}
@AfterMethod
public void brother2() {
	System.out.println("@AfterMethod:brother2");

}

@AfterClass
public void brother3() {
	System.out.println("@AfterClass:brother3");

}
@AfterTest
public void sister1() {
	System.out.println("@AfterTest:sister1");

}
@AfterSuite
public void sister2() {
	System.out.println("@AfterSuite:sister1");

}

}
