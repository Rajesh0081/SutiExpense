package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Functionality {
	public WebDriver driver;
	
	@BeforeClass
	
	public void launch() {
		 driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	
	public void login() throws Exception {
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in"); // To Enter any value in the textbox "sendkeys"
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click(); 
		
	}
	
	@Test
	public void url() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	@AfterClass
	public void logout() {
		driver.close();
		
	}

}
