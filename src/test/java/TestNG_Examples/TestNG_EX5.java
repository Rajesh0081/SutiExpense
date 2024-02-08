package TestNG_Examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_EX5 {
	@BeforeSuite
	public void beforeclass() {
		System.out.println("This is a before Suite");
	}
	
	
	
	@Test
	public void test1() {
		System.out.println("This is a main method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is a main method 2");
	}
	
	
	@AfterSuite
	public void afterclass() {
		System.out.println("This is a after Suite");
	}

}
