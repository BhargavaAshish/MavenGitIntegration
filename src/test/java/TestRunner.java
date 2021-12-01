
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Mavengit.MavenGitIntegration.LoginPage;

//import Mavengit.MavenGitIntegration.LoginPage;


public class TestRunner {
	
	WebDriver driver;
	
	@Test
	public void login() {

		 String currentDir = System.getProperty("user.dir");
		 System.out.println("Current dir using System:" + currentDir);

		System.setProperty("webdriver.chrome.driver",currentDir+"/drivers/chromedriver96.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/") ;
		
	   LoginPage lp = new LoginPage(driver);
	   lp.enterUserName("ashish123");
	   lp.enterPassword("552779");
	   lp.pressLoginButton();
	   driver.quit();
		
	}
}
