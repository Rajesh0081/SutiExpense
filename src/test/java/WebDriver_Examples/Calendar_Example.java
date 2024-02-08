package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Example {

	public static void main(String[] args) throws Exception {
		
		String month="August 1990";
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in"); // To Enter any value in the textbox "sendkeys"
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click(); 
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[3])[1]")).click();
		
		
		driver.findElement(By.xpath("//input[@name='fromDate']")).click();
		
		while(true) {
			String text=driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']")).getText();
			if(text.matches(month)) {
				break;
				
			}
			else {
				driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='prev']")).click();
			}
		}
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),'16')]")).click();
		

	}

}
