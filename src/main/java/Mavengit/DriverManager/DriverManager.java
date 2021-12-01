package Mavengit.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	WebDriver driver;
	
	public  WebDriver getInstance() {
		System.setProperty("driver", "E:\\Selenium\\chromedriver_win32\\chromedriver92.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
	
}
