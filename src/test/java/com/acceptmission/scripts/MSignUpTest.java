package com.acceptmission.scripts;

import org.testng.annotations.Test;

import com.acceptmission.pageObject.MSignUp;
import com.acceptmission.utilities.BaseLib1;


public class MSignUpTest extends BaseLib1{
	@Test
	public void validSignUp()
	{
		MSignUp lp = new MSignUp(driver);
		//lp.clickOn_GetStartedNow_Btn();
		lp.enterFirstName("First");
		lp.enterLastName("Last");
		lp.enterEmail();
		lp.enterPhoneNumber("1234567890");
		lp.enterComapnyName("TestTech");
		lp.enterPassword("123Test");
		lp.enterConfirmPassword("123Test");
		lp.ClickOnSignUp_Btn();
		
	}

}
