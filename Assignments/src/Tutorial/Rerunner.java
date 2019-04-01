package Tutorial;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class Rerunner {
	@Test()
	public void runn() {
		TestNG test = new TestNG();
		List<String> ls = new ArrayList<>();
		ls.add("C:\\eclipse\\69+0\\TestNg1\\test-output\\testng-failed.xml");
		test.setTestSuites(ls);
		test.run();

	}

}
