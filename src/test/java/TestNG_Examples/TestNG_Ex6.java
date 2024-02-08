package TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Ex6 {
	
	
	@BeforeTest
	
	public void m1() {
		System.out.println("This is a Before Test");
	}
	
	
	@Test(priority = 10)
	
	public void main() {
		System.out.println("This is main method 1");
	}
	
	
	@Test (priority = 20)
	
	public void main2() {
		System.out.println("This is main method 2");
	}
	
	@Test(priority = 8)
	
	public void main3() {
		System.out.println("This is main method 3");
	}
	
	@AfterTest
	public void m2() {
		System.out.println("this is a after test");
	}

}
