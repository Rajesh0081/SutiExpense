package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Ex2 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a before class");
	}
	
	
	
	@Test
	public void test1() {
		System.out.println("This is a main method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is a main method 2");
	}
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is a after class");
	}

}
