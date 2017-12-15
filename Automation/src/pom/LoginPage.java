package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
		@FindBy(id="username")
		private WebElement unTB;
		
		@FindBy(name="pwd")
		private WebElement pwTB;
		
		@FindBy(id="loginButton")
		private WebElement loginbutton;
		
		@FindBy(xpath="//span[contains(text(),'invalid')]")
		private WebElement errMsg;
		
		
		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		public void setUserName(String un){
			unTB.sendKeys(un);
		}
		
		public void setPassword(String pw){
			pwTB.sendKeys(pw);
		}
		
		public void setClickLogin(){
			loginbutton.click();
		}
		
		
		public void verifyErrMsg()
		{
			//boolean v = errMsg.isDisplayed();// instead of this we can add this inside the 
			//asserttrue statement only
			//Assert.assertEquals(v, true);
			Assert.assertTrue(errMsg.isDisplayed());
			
		}	
		
}
