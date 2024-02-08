package WebDriver_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws Exception   {
WebDriver driver=new ChromeDriver(); // To Open The new Empty Browser
		
		driver.get("https://apps17.sutisoft.com/");  // To open Specific URL
		
		driver.manage().window().maximize(); // To Maximize the window
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in"); // To Enter any value in the textbox "sendkeys"
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn login-']"))).click();
	}

}
