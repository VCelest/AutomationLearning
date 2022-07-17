package tests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy.ByAccessibilityId;

public class tests extends BaseClass {
	
	@Test
	public void testcal() throws MalformedURLException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.className("android.widget.Button")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='DO IT LATER']")).click();
		System.out.println("Completed first test .....");
	}

}
