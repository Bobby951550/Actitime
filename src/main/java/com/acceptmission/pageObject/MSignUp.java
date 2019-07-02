package com.acceptmission.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.acceptmission.utilities.BaseLib1;
import com.acceptmission.utilities.SeleniumLib;

public class MSignUp extends BaseLib1{
	SeleniumLib slib;
	
	@FindBy(xpath = "(//a[contains(@class,'fusion-button button-flat fusion-button')])[1]")
	private WebElement Get_Started_Now;
	@FindBy(id = "user_email")
	private WebElement enter_Email;
	@FindBy(xpath = "//span[contains(text(),'SIGN UP FREE')]")
	private WebElement Sign_Up_Free;
	@FindBy(xpath = "//input[@name='user[first_name]']")
	private WebElement First_Name;
	@FindBy(xpath = "//input[@id='user_last_name']")
	private WebElement Last_Name;
	@FindBy(xpath = "//input[@id='user_phone_number']")
	private WebElement Phone_Number;
	@FindBy(xpath = "//input[@id='company_name']")
	private WebElement  Company_Name;
	@FindBy(id="user_password")
	private WebElement setPassword;
	@FindBy(id="user_password_confirmation")
	private WebElement setConfirmPassword;
	@FindBy(xpath = "//input[@value='Sign Up']")
	private WebElement  SignUp;
	@FindBy(xpath = "//a[@class='appcues-button appcues-button-success']")
	private WebElement  ClosePopup;
	
	public MSignUp(WebDriver driver)
	{
		slib = new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn_GetStartedNow_Btn() {
		Get_Started_Now.click();
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterEmail() {
		long millis = System.currentTimeMillis() % 1000;
	       String  	strUserEmail="acm"+ millis+"@yopmail.com";
	       enter_Email.sendKeys(strUserEmail);
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void clickOnSignUpFreeBtn() {
		Sign_Up_Free.click();
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterFirstName(String firstname) {
		First_Name.sendKeys(firstname);
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterLastName(String lastname) {
		Last_Name.sendKeys(lastname);;
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterPhoneNumber(String phonenum) {
		Phone_Number.sendKeys(phonenum);;
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterComapnyName(String companyname) {
		Company_Name.sendKeys(companyname);
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterPassword(String password) {
		setPassword.sendKeys(password);
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void enterConfirmPassword(String Confirmpassword) {
		setConfirmPassword.sendKeys(Confirmpassword);
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void ClickOnSignUp_Btn() {
		SignUp.click();
		Reporter.log("<br>clickLoginBtn", true);
	}
	public void closePopup() {
		ClosePopup.click();
		Reporter.log("<br>clickLoginBtn", true);
	}

}
