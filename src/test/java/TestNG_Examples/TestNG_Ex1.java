package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Ex1 {
	
	
	@BeforeSuite
	 
	public void BeforeSuite() {
		System.out.println("This is a BeforeSuite");
	}
	
	@BeforeTest
	
	public void BeforeTest() {
		System.out.println("This is a Before Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a Beforeclass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is a Before Method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is afterclass");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("This is aftertest");
	}
	
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is aftersuite");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is after method");
	}
	
	
	@Test
	public void test() {
		System.out.println("This is a main method");
	}


}
