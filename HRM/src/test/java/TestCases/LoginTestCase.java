package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class LoginTestCase extends LoginPage{
	@BeforeMethod
	public void LaunchBrowser() throws Throwable {
		driver = launchUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority = 0)
	public void forgot() throws Exception {
		forgotPassword();
		System.out.println("passed");
	}
	@Test(priority =1)
	public void login() throws Exception {
		loginhrm();
		System.out.println("passed");
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	

}
