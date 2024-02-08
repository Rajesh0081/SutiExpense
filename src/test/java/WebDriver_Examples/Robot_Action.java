package WebDriver_Examples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_Action {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rajeshv@sutisoft.in");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		driver.findElement(By.name("userpassword")).sendKeys("test@1234");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
