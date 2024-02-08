package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Verify_URL {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://apps17.sutisoft.com/");
		

		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
	}

}
