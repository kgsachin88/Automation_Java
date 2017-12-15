package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class BaseTest {

	public 
	WebDriver driver; //global variable
	@BeforeMethod
	public void preCondition(XmlTest x)
	{
		String v = x.getParameter("browser");
		Reporter.log(v,true);
		if (v.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",".\\exe\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(v.equals("IE")){
			System.setProperty("webdriver.ie.driver",".\\exe\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else
		{
			driver =new FirefoxDriver();//local variable
		} 		
		driver.get("http://localhost");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	

	@AfterMethod
	public void postCondition(){
		driver.close();
	}
}
