package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public WebDriver driver;
	
	@Given("Open SutiExpense Application")
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
	}
	
	@When("Typing Username and Password")
	public void login() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in"); // To Enter any value in the textbox "sendkeys"
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
	}
	
	
	
	@Then("Login page should display")
	public void closebrowser() {
		driver.close();
		
	}

}
