package mobileAutomation.setup;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import androidPageObjects.Preference;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Base 
{

	public AppiumDriver driver;
	public Preference preference;
	
	@BeforeMethod
	@Parameters("Device")
	public void configure(String Device) throws MalformedURLException
	{
		
//		if (Device.equals("Android")) {
//			System.out.println(Device);
//			UiAutomator2Options options = new UiAutomator2Options();
//			options.setPlatformName("Android");
//			options.setCapability("deviceName", "PreetamEmulator");
//			//options.setCapability("app", "//Users//preetammitra//Desktop/Learn EveryDay//Automation Workspaces//All in 1 Workspace//LearnAppium//src//test//java//resources//ApiDemos-debug.apk");
//			options.setCapability("app", "//Users//preetammitra//Desktop//Learn EveryDay//Automation Workspaces//All in 1 Workspace//LearnAppium//src//test//java/resources//ApiDemos-debug.apk");
//			// driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),options);
//			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
//			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			// AppiumDriver driver = new AndroidDriver();
//			 preference = new Preference((AndroidDriver) driver);
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setCapability("deviceName", "PreetamEmulator");
		options.setCapability("app", "//Users//preetammitra//Desktop/Learn EveryDay//Automation Workspaces//All in 1 Workspace//LearnAppium//src//test//java//resources//ApiDemos-debug.apk");
		 driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 preference = new Preference((AndroidDriver) driver);
		}
		
	
	public AppiumDriver getDriver() {
        return driver;
    }
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
