package PageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import CommonFunctionalities.CommonActions;

public class LoginPage extends CommonActions{
	public void loading() throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\SpeardSheets\\config.properties");
	prop.load(fis);
	}
	
	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By login = By.xpath("//button[@type='submit']");
	public By Forgotpassword = By.xpath("//button[@type=\"submit\"]/..//following-sibling::div/p");
	

   public void login() {
	   
	   
	   
   }
}