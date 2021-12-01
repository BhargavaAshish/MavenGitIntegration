package Mavengit.MavenGitIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;
	
	By  userName  = By.xpath("//input[@id='username']");
	By  password = By.xpath("//input[@id='password']");
	By  loginButton = By.xpath("//input[@id='login']");
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void enterUserName(String uname) {
		driver.findElement(userName).sendKeys(uname);
	}
	
	public void enterPassword(String  passwd) {
		driver.findElement(password).sendKeys(passwd);
	}
	
	public void pressLoginButton() {
		driver.findElement(loginButton).click();
	}
}
