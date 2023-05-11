package mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class salesforce {
//	static AndroidDriver<MobileElement> driver;
//	static IOSDriver<MobileElement> iosDriver;
	static AppiumDriver<MobileElement> driver;

public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("deviceName","ZY2258KMRN");
		
//		dc.setCapability("unlockType", "swipe");
//		dc.setCapability("unlockPin", "187894");
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.salesforce.chatter");
	
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Chatter");
		//dc.setCapability(MobileCapabilityType.NO_RESET, true);
		//dc.setCapability("autoGrantPermission", true);
		
		//dc.setCapability(AndroidMobileCapabilityType.BROWSER_NAME, "chrome");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url, dc);
		
		driver.get("https://login.salesforce.com");
		//com.salesforce.chatter:id/mi_accept
		Thread.sleep(2000);
		MobileElement el1 = (MobileElement) driver.findElementById("com.salesforce.chatter:id/mi_accept");
		el1.click();
         //driver.findElementById("com.salesforce.chatter:id/mi_accept").click(); 
		driver.findElementByXPath("//*[@id='username']").sendKeys("abcdcxf");
}
}
