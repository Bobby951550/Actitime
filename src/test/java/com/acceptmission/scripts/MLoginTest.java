package com.acceptmission.scripts;

import org.testng.annotations.Test;

import com.acceptmission.pageObject.MLogin;
import com.acceptmission.utilities.BaseLib1;


public class MLoginTest extends BaseLib1{
	@Test
	public void validLogin()
	{
		MLogin lp = new MLogin(driver);
		lp.login("testlabel123456+999@gmail.com", "Test@123");
	}

}
