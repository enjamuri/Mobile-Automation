package mobiletesting;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class demo {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("deviceName","ZY2258KMRN");
		//dc.setCapability("App","path apk file");
		dc.setCapability("appPackage","com.google.android.calculator");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		//http:127.0.0.1:4723 or http://localhost:4723
		URL url= new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url, dc);
		//com.google.android.calculator:id/digit_9
//com.google.android.calculator:id/op_add
//com.google.android.calculator:id/digit_4
//com.google.android.calculator:id/eq

		driver.findElementById("com.google.android.calculator:id/digit_9").click();
		driver.findElementByAccessibilityId("plus").click();
		driver.findElementByAccessibilityId("4").click();
		driver.findElementById("com.google.android.calculator:id/digit_4").click();
		driver.findElementByAccessibilityId("equals").click();
		
		//String s=driver.findElementById("com.google.android.calculator:id/result_preview").getText();
		//System.out.println(s);
		//System.out.println(driver.findElementByClassName("android.widget.EditText").getText());
	     
		
	}

}
