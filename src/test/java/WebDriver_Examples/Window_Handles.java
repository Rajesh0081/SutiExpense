package WebDriver_Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.xpath("//input[@name='userpassword']")).sendKeys("test@1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		System.out.println("Login to the Application Successfully.........");
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[7])[1]")).click();
		System.out.println("Clicked on Help Tab.......");
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[7])[1]/ul/li[1]")).click();
		System.out.println("Clicked on User Guide....");
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(parent);
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[7])[1]")).click();
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[7])[1]/ul/li[2]")).click();

	}

}
