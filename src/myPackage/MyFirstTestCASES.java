package myPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyFirstTestCASES {

	// this is what we do in selenium - for the web testing

//	WebDriver driver = new ChromeDriver(); 

	// this is what we do for the appium for mobile testing

	DesiredCapabilities caps = new DesiredCapabilities();
	AndroidDriver driver;

    @BeforeTest
    public void TheSetUp() {
    	
    	// we will use them always 
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Anas");
        
        // we use them only when we need to interact with browsers 
//        caps.setCapability("chromedriverExecutable", "D:\\chromeWebDriver\\chromedriver.exe");
//        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        
        // we need to add two lines for this 
        
        File CalculatorApp = new File("src/myApplications/calculator.apk");
		caps.setCapability(MobileCapabilityType.APP, CalculatorApp.getAbsolutePath());
    }

//	@Test()
//	public void TestTheBrowser() throws MalformedURLException {
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//		
//		driver.get("https://www.google.com");
//		
//		driver.findElement(By.id("XSqSsc")).sendKeys("Linkedin"+Keys.ENTER); 
//
//	}
	
	@Test()
	
	public void testOneApp() throws MalformedURLException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click(); 
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click(); 

		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click(); 

		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click(); 

		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click(); 
		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click(); 

	}

	@AfterTest
	public void PostTesting() {
	}

}
