package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.EnterTimeTrackPage;
import page.LicensesPage;
import page.LoginPage;

public class CheckIssueDate extends BaseTest
{
	@Test(priority=1)
	public void testCheckIssueDate()
	{
		String un= FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1, 0);
		String pw= FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1, 1);
		String issueDate= FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1, 2);
		
		// Enter valid user name
		LoginPage l= new LoginPage(driver);
		l.setUserName(un);
		
		//Enter the valid password
		l.setPassword(pw);
		//click on login
		l.clickLOgin();
		//verify on settings
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.click_Settings();
		//click on licenses
		e.click_Licenses();
		LicensesPage lp= new LicensesPage(driver);
		//verify licenses Date
		lp.verifyIssueDate(issueDate);
		
		
		
	}
}
