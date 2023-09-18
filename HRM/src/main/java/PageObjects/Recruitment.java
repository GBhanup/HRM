package PageObjects;

import org.openqa.selenium.By;

import CommonFunctionalities.CommonActions;

public class Recruitment extends CommonActions{
	
	public By recruitment = By.xpath("//span[text()='Recruitment']");
	public By Add = By.xpath("//div[@class=\"orangehrm-paper-container\"]/div/button");
	//Add Candidate
	public By FullName = By.xpath("//label[text()='Full Name']/.."); 
	public By FirstName = By.xpath("//input[@name='firstName']");
	public By MiddleName  = By.xpath("//input[@name='middleName']");
	public By lastName = By.xpath("//input[@name='lastName']");
	public By VacancyDropdown = By.xpath("//div[@class='oxd-select-text-input']"); // //i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']
	
}
