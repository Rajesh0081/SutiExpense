package TestNG_Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_EX4 {
	@BeforeTest
	public void beforeclass() {
		System.out.println("This is a before test");
	}
	
	
	
	@Test
	public void test1() {
		System.out.println("This is a main method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is a main method 2");
	}
	
	
	@AfterTest
	public void afterclass() {
		System.out.println("This is a after test");
	}


}
