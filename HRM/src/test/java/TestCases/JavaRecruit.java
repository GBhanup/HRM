package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import TestCases.*;
import CommonFunctionalities.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class JavaRecruit extends CommonActions{
	
	public static WebDriver driver;
	public void SelectData(String locatorText) {
		driver.findElement(By.xpath("//span[text()='"+locatorText+"']")).click();
		}
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class=\"orangehrm-paper-container\"]/div/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		Thread.sleep(3000);
		JavaRecruit hm = new JavaRecruit();
		hm.SelectData("Payroll Administrator");
		
		
		
				
		
				
			
		}

}
