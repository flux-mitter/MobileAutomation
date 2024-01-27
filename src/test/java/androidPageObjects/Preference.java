package androidPageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actions.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preference extends AndroidActions
{
	AndroidDriver driver;
	
	
	public Preference(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(accessibility = "Preference")
	private WebElement androidPreference;
	@AndroidFindBy(xpath = "//*[contains(@text,'3. Preference dependencies')]")
	private WebElement androidPreferenceDependencies;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi']/../..//android.widget.CheckBox")
	private WebElement androidPreferenceCheckBox;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings' and @enabled ='true']")
	private WebElement androidPreferencewifiSettingsEnabled;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
	private WebElement androidPreferenceWifiSettings;
	@AndroidFindBy(id = "android:id/edit")
	private WebElement androidPreferenceWifiSettingsEdit;
	@AndroidFindBy(id = "android:id/button1")
	private WebElement androidPreferenceWifiSettingsOk;
	//@AndroidFindBy(accessibility = "//android.widget.TextView[@text='WiFi settings']");
	
	public void changeWifiName(String wiFiName)
	{
		clickElement(androidPreference, 10);
		clickElement(androidPreferenceDependencies,10);
		clickElement(androidPreferenceCheckBox,10);
		Assert.assertTrue(androidPreferencewifiSettingsEnabled.isDisplayed());
		//clickElement(androidPreferencewifiSettingsEnabled, 10);
		clickElement(androidPreferenceWifiSettings, 10);
		androidPreferenceWifiSettingsEdit.sendKeys(wiFiName);
		clickElement(androidPreferenceWifiSettingsOk, 10);
		
	}
	
	public String validateUpdate()
	{
		clickElement(androidPreferenceWifiSettings, 10);
		return androidPreferenceWifiSettingsEdit.getAttribute("text");
	}
	
	
	
}
