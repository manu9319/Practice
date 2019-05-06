package Tutorial;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class FirstScript {
	@BeforeSuite
	public void a() {
		Reporter.log("suit", true);
	}

	@BeforeTest
	public void b() {
		Reporter.log("test", true);
	}

	@BeforeClass
	public void c() {
		Reporter.log("class", true);
	}

	@BeforeMethod
	public void d() {
		Reporter.log("method", true);
	}

	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("Ankur Verma");
	}

	@Test(groups = "Smoke", priority = 2)
	public void test2() {
		System.out.println("Ankur");
		// Assert.fail();
	}

	@Test(groups = "Smoke")

	public void test3() {
		System.out.println("Ankur Verma");
		// Assert.fail();

	}

	@Test(dependsOnMethods = { "test1", "test2" })
	public void test4() {
		System.out.println("Ankur Verma 09");
	}

	@Test(enabled = false)
	public void test5() {
		System.out.println("Case 5");
	}

	@Test
	public void afterMethod() {
		System.out.println("Method 1");
	}

}
