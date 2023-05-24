package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class Finish extends TestBase{
	public Finish()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id=\"finish\"]")
	private WebElement finish;
	
	public void Finish1()
	{
		finish.click();
	}
}

