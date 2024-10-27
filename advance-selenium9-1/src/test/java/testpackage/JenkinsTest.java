package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {

	@Test
	public void jenkinsTest() {
		Reporter.log("Jenkins", true);
	}
}
