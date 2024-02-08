package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Ex3 {
	@BeforeMethod
	public void beforeclass() {
		System.out.println("This is a before method");
	}
	
	
	
	@Test
	public void test1() {
		System.out.println("This is a main method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is a main method 2");
	}
	
	
	@AfterMethod
	public void afterclass() {
		System.out.println("This is a after method");
	}

}
