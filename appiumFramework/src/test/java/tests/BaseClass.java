package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//cap.setCapability("appPackage", "com.google.android.calendar");
		//cap.setCapability("appActivity", "com.android.calendar.LaunchActivity");
		
		cap.setCapability("appPackage", "com.app.baelio");
		cap.setCapability("appActivity", "com.app.baelio.MainActivity");

		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver =new AppiumDriver(url,cap);
		System.out.println("Apllication started");
		
		
		
	}
	
	@Test
	public void sampleTest() {
		System.out.println("Start test");
	}
	
	/*@AfterTest
	public void quit() {
		
		driver.close();
		
	}*/

}
