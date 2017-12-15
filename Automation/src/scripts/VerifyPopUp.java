package scripts;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyPopUp extends BaseTest
{
	@Test
	public void testVerifyPopUp(){
		LoginPage l = new LoginPage(driver);
		//Enter valid UN
		l.setUserName("admin");
		//Enter valid PW
		l.setPassword("manager");
		//Click on the login button
		l.setClickLogin();
		
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		//Click on the help menu
		e.clickHelp();
		//Click on the about actiTIME menu
		e.clickAboutactiTimeMenu();
		//Verify the pop up menu
		e.verifyAboutPopup();
		//Click on the close pop up button
		e.clickclose();
		//Click on Logout link
		e.clickLogout();
	}
	
}
