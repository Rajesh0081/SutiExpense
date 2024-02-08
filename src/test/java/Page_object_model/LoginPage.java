package Page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	//locators
	
	By txt_Username=By.xpath("//input[@type='text']");
	By txt_Userpassword=By.xpath("//input[@type='password']");
	By txt_Submit=By.xpath("//button[@class='btn login-btn']");
	
	//actions
	
	public void setUsername(String username) {
		driver.findElement(txt_Username).sendKeys(username);
		
	}
	public void setpassword(String userpassword) {
		driver.findElement(txt_Userpassword).sendKeys(userpassword);
		
	}
	public void clickSubmit() {
		driver.findElement(txt_Submit).click();
	}

}
