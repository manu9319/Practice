package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test(priority=2)
	public void testInvalidLogin()
	{
		String un= FWUtil.getXLData(INPUT_PATH, "InvalidLogin", 1, 0);
		String pw= FWUtil.getXLData(INPUT_PATH, "InvalidLogin", 1, 1);

		
		// Enter Invalid user name
		LoginPage l= new LoginPage(driver);
		l.setUserName(un);
		
		//Enter the Invalid password
		l.setPassword(pw);
		//click on login
		l.clickLOgin();
		//verify error message should display
		l.verifyErrMsgDisplayed();
	}

}
