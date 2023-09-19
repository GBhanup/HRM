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
	public By email = By.xpath("//label[text()='Email']/..//following-sibling::div/input");
	public By contactNumber  = By.xpath("//label[text()='Contact Number']/..//following-sibling::div//input");
	public By Keywords  = By.xpath("//input[@placeholder=\"Enter comma seperated words...\"]");
	public By DateofApplication  = By.xpath("//input[@placeholder=\"yyyy-mm-dd\"]");
	public By Notes  = By.xpath("//textarea[@placeholder=\"Type here\"]");
	public By Consenttokeepdata  = By.xpath("//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]");
	public By save  = By.xpath("//button[@type=\"submit\"]");

	public void navigatingtoRecruitpage(){
		clickElement(recruitment);
		clickElement(Add);
		enterText(FullName, "BhanuPrakash");
		enterText(FirstName, "Bhanu");
		enterText(MiddleName, "Geddam");
		enterText(lastName, "Prakash");
		clickElement(VacancyDropdown);
		SelectData("Payroll Administrator");
		enterText(email, "bhjkl@gmail.com");
		enterText(contactNumber, "6547896547");
		enterText(Keywords, "admission success");
		enterText(DateofApplication, "2023-08-25");
		enterText(Notes, "will be joined");
		clickElement(Consenttokeepdata);
		clickElement(save);
		
		
		
	}
}
