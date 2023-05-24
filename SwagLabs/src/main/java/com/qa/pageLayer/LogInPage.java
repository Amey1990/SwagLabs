package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LogInPage extends TestBase{
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"user-name\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement pwd_Box;
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	private WebElement Login_Btn;
	
	public void enterusername(String email)
	{
		username.sendKeys(email);
	}
	public void enterpassword(String pwd)
	{
		pwd_Box.sendKeys(pwd);
	}
	public void clickOnLoginButton()
	{
		Login_Btn.click();
	}
}
