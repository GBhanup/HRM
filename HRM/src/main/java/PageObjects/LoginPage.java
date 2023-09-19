package PageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import BaseClass.Browser;
import CommonFunctionalities.CommonActions;

public class LoginPage extends Browser{
	
	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By login = By.xpath("//button[@type='submit']");
	public By Forgotpassword = By.xpath("//p[text()='Forgot your password? ']");
	

   public void loginhrm() throws Exception {
	  
	   enterText(username, "Admin");
	   enterText(password, "admin123");
	   
	   clickElement(login);  
   }
   public void forgotPassword() throws Exception {
	   enterText(username, "adm");
	   enterText(password, "fgrs");
	   clickElement(login);
	   Thread.sleep(5000);
	   clickElement(Forgotpassword);
	   System.out.println(driver.getCurrentUrl());
	   
}
}