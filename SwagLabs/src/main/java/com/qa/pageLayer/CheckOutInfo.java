package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class CheckOutInfo extends TestBase{
	public CheckOutInfo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"first-name\"]")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id=\"last-name\"]")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id=\"postal-code\"]")
	private WebElement zipCode;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement contin;
	
	public void FirstName(String first)
	{
		firstName.sendKeys(first);
	}
	public void LastName(String last)
	{
		lastName.sendKeys(last);
	}
	public void Zip(String zip)
	{
		zipCode.sendKeys(zip);
	}
	public void Continue()
	{
		contin.click();
	}
}
