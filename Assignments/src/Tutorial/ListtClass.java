package Tutorial;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Test1.Listt.class)
public class ListtClass {
/*	@BeforeSuite
	public void suite() {

	}

	@AfterSuite
	public void suittt() {

	}*/

	@Test(retryAnalyzer = Tutorial.TestFailed.class)
	public void run() {
		//Assert.assertTrue(false);
		System.out.println("Method");
	}

	@Test
	public void run2() {
		System.out.println("Ankur");
	}
	@AfterMethod
	public void after(ITestResult r){
		System.out.println(r.getName());//,r.getStatus()
	}

}
