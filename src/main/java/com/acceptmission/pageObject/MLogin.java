package com.acceptmission.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acceptmission.utilities.SeleniumLib;

public class MLogin {
	
	SeleniumLib slib;
	
	@FindBy(id = "user_email")
	private WebElement emailTxtbox;
	
	@FindBy(id = "user_password")
	private WebElement passTxtbox;
	
	@FindBy(xpath = "//input[contains(@value,'Log in')]")
	private WebElement loginBtn;
	
	public MLogin(WebDriver driver)
	{
		slib = new SeleniumLib(driver);
		PageFactory.initElements(driver, this);
	}
	/////features
	public void login(String username, String password)
	{
		slib.enterdata(emailTxtbox,username);
		slib.enterdata(passTxtbox, password);
		loginBtn.click();
	}
	
}
