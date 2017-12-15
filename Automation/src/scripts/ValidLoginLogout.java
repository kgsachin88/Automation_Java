package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest
{
	//Test Case 01
	@Test
	public void testValidLoginLogout()
	{
		System.setProperty("webdriver.chrome.driver",".\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter valid Username
		LoginPage l= new LoginPage(driver);
		l.setUserName("admin");
		//enter valid pwd
		l.setPassword("manager1");
		//click login
		l.setClickLogin();
		//click logout
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
				e.clickLogout();
				
				driver.close();
	}
}
