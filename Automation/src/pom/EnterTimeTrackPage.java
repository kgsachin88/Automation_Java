package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage {
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(linkText="About actiTIME")
	private WebElement AboutactiTimeMenu;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closeButton;
	
	@FindBy(id="aboutPopup")
	private WebElement aboutPopup;	
	
	public EnterTimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout(){
		logoutLink.click();
	}
	
	public void clickHelp(){
		help.click();
	}
	
	public void clickAboutactiTimeMenu(){
		AboutactiTimeMenu.click();
	}
	
	public void clickclose(){
		closeButton.click();
	}
	
	public void verifyAboutPopup(){
		
		Assert.assertTrue(aboutPopup.isDisplayed());
	}
}
