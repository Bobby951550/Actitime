package com.acceptmission.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class SeleniumLib {
	WebDriver driver;
	
	public SeleniumLib(WebDriver driver)
	{
		this.driver=driver;
	}
	
	////////////////////enter data//////////////////////
	public void enterdata(WebElement textBox, String input)
	{
		if(textBox.getAttribute("value")!=null)
		{
			textBox.clear();
			textBox.sendKeys(input);
		}
		else
		{
			textBox.sendKeys(input);
		}
	}
	
	///////////////click button/////////////////
	public void clickButton(WebElement button)
	{
		if(button.getAttribute("type").equals("button"))
		{
			button.click();
		}
		else if(button.getAttribute("type").equalsIgnoreCase("submit"))
			{
				button.submit();
			}
		}
	

///////////////////////////////click checkbox//////////////////////
public void clickCheckBox(WebElement checkbox)
{
	if(checkbox.isSelected()==false)
	{
		checkbox.click();
	}
}

/////////////////////////mouse over///////////////////
public void mouseover(WebElement element)
{
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
}

//////////////////select Options by Text/////////////////////
public void selectOptionsByText(WebElement dropdown, String text)
{
	Select sel = new Select(dropdown);
	sel.selectByVisibleText(text);
}

////////////////////////hard core wait////////////////////
public void isSleep(int seconds)
{
	try
	{
		Thread.sleep(seconds*1000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
		
	}
}
/***********************explicit Wait*******************/
public void eWaitForVisible(int seconds, WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver, seconds);
	wait.until(ExpectedConditions.visibilityOf(element));
}
/******************************assert**************************/
public void validate(String expected, String actual, String msg)
{
	Assert.assertEquals(actual, expected);
	Reporter.log(msg, true);
}
/*******************get title********************/
public String getPageTitle()
{
	String title = driver.getTitle();
	
	return title;
}
/*****************assert displayed*****************/
public void validateElementDisplayed(WebElement element, String exptext, String msg)
{
	Assert.assertTrue(element.isDisplayed());
	Assert.assertTrue(element.getText().contains(exptext));
	Reporter.log(msg, true);
}
/*********************get total options text from dropdown************/
public List<String> getAllOptionsText(WebElement drpDwn)
{
	
	Select sel=new Select(drpDwn);
	List<WebElement> allops = sel.getOptions();
	
	List<String> lt=new ArrayList<String>();
	
	
	for (int i = 0; i < allops.size(); i++) 
	{
		lt.add(allops.get(i).getText());
	}
	
	return lt;
}
/*******************assertEquals by text***************/
public void assertByText(String actText,String expText)
{
	Assert.assertEquals(actText, expText);
	Reporter.log(expText+" is verified", true);
}


}
