package actions;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import mobileAutomation.setup.Base;

public class AndroidActions{

	AndroidDriver driver;
	// AppiumDriver driver;
	// WebDriverWait wait;

	public AndroidActions(AndroidDriver driver) {
		this.driver = driver;
	}

	public void customWait(WebElement element,int intTimeInMillis)
	{
		 long t0, t1;
		 boolean blnObjectExistFlag=false;
		 try
		 {
			 t0 = System.currentTimeMillis();
			 do
			 {
				 if(element.isDisplayed())
				 {
					 blnObjectExistFlag=true;
					 break;
				 }
				 t1 = System.currentTimeMillis();
			 }while (t1 - t0 < intTimeInMillis && !blnObjectExistFlag);
		 }catch(Exception ex)
		 {
			 
		 }
	}

	public void clickElement(WebElement element, int waitTimeInMilli) {
		// WebDriverWait wait=new WebDriverWait(WebDriveReference,TimeOut);
		customWait(element, waitTimeInMilli);
		element.click();
	}
}
