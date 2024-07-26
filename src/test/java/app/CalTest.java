package app;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalTest {
	
	public static AndroidDriver<MobileElement> apdriver;
	
	public static void	main(String[] args) throws MalformedURLException {
		System.out.println("start");
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
	
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "CPH2505"); // Android Emulator
    
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
  
        dc.setCapability("appPackage", "com.coloros.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator"); // This is Launcher activity of your app
                                                                                // (you can get it from apk info app)
      
        URL url = new URL("http://127.0.0.1:4723/");

        AndroidDriver driver = new AndroidDriver(url, dc);
       
      WebElement buttonOne=driver.findElement(By.id("com.coloros.calculator:id/digit_1"));
       WebElement buttonTwo= driver.findElement(By.id("com.coloros.calculator:id/digit_5"));
      WebElement plus=driver.findElement(By.id("com.coloros.calculator:id/img_op_add"));
      WebElement equalto=driver.findElement(By.id("com.coloros.calculator:id/img_eq"));
        buttonOne.click();
       plus.click();
        buttonTwo.click();
       equalto.click();
        
        

		
	}

}
