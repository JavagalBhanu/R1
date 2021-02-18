package project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void testA() {
		Reporter.log("Hi",true);
	}
}
