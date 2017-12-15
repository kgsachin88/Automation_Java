package scripts;

import org.testng.annotations.Test;
import generics.excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogoutExcel extends BaseTest {
@Test
public void testValidLoginLogout(){
	String xlpath = "./excel/testData.xlsx";
	String sheet="ValidLoginLogout";
	String un = excel.getcellvalue(xlpath, sheet, 1, 0);
	String pw = excel.getcellvalue(xlpath, sheet, 1, 1);
	LoginPage l =new LoginPage(driver);
	l.setUserName(un);
	l.setPassword(pw);
	l.setClickLogin();
	EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	e.clickLogout();
}

}
