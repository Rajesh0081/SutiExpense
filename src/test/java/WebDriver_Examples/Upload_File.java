package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver(); // To Open The new Empty Browser
		
		driver.get("https://apps17.sutisoft.com/");  // To open Specific URL
		
		driver.manage().window().maximize(); // To Maximize the window
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in"); // To Enter any value in the textbox "sendkeys"
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click(); 
		
		driver.findElement(By.xpath("//div[@class='profile-pic']/a/img")).click();
		
		driver.findElement(By.xpath("//ul[@id='userDropDownMenuId']/li[2]")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\Desktop\\'Sivapriya Fresher Resume.docx");
		
		
		

	}

}
