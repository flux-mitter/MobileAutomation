package androidPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actions.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Views extends AndroidActions{
	
AndroidDriver driver;
	
	
	public Views(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Views']")
	private WebElement views;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Expandable Lists']")
	private WebElement expandableLists;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Custom Adapter')]")
	private WebElement customAdapter;
	
	@AndroidFindBy(xpath =  "//android.widget.TextView[contains(@text,'People')]")
	private WebElement peopleNames;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample menu']")
	private WebElement sampleMenu;
	
	
	public void validateSampleView()
	{
		clickElement(views, 10);
		clickElement(expandableLists, 10);
		clickElement(expandableLists, 10);
		//return androidPreferenceWifiSettingsEdit.getAttribute("text");
	}

}
