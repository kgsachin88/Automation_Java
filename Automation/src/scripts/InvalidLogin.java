package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.LoginPage;

public class InvalidLogin  {
	@Test
	public void testInvalidLogin(){
		System.setProperty("webdriver.chrome.driver",".\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		LoginPage l = new LoginPage(driver);
		//Enter the invalid UN
		l.setUserName("Test");
		//Enter invalid PW
		l.setPassword("ase");
		//CLick on Login Button
		l.setClickLogin();
		//Verify the error msg
		l.verifyErrMsg();
	
		driver.close();
		
	}

	
}
