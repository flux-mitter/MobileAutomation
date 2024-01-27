package testCases;

import static org.junit.Assert.assertEquals;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import androidPageObjects.Preference;
import mobileAutomation.setup.Base;
import static utils.ExtentTestManager.startTest;

public class TestCase01 extends Base {
	
	
	@Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
    
	//@Parameters("Device")
	public void testWifinameChange(Method method) {
		//System.out.println(Device);
		startTest(method.getName(), "Invalid Login Scenario with invalid username and password.");
		preference.changeWifiName("HelloWifi");
		assertEquals("HelloWifi", preference.validateUpdate());
	}
	@Test
	//@Parameters("Device")
	public void testWifinameChange2() {
		//System.out.println(Device);
		preference.changeWifiName("HelloWifi");
		assertEquals("HelloWifi", preference.validateUpdate());
	}
}
