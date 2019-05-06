package Tutorial;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	public void user() {
		/*
		 * String Et = "ankur.fb.com"; String At = "ankur.fb.com";
		 * Assert.assertEquals(At, Et);
		 * System.out.println("Actual is matching with expected titel");
		 * 
		 * boolean Ex = true; boolean Ax = false; Assert.assertEquals(Ax, Ex);
		 * System.out.println("Actual is matching with expected titel");
		 */

		/*
		 * Set<String> s = new HashSet<>(); Collections.addAll(s, "abc", "xyz",
		 * "stu");
		 * 
		 * Set<String> s2 = new HashSet<>(); Collections.addAll(s2, "abc", "xy",
		 * "st");
		 * 
		 * Assert.assertNotEquals(s, s2, "Working");
		 */

		/*
		 * Assert.assertTrue(true);//same for false
		 */

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(9, 9);

		System.out.println("Failjasdfs");
		sa.assertAll();
	}

}
