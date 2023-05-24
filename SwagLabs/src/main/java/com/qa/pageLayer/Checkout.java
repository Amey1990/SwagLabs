package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class Checkout extends TestBase{
	public Checkout()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	private WebElement cout;
	
	@FindBy(xpath="//button[@class=\"btn btn_action btn_medium checkout_button\"]")
	private WebElement cout1;
	
	public void checkout()
	{
		cout.click();
	}
	public void checkout1()
	{
		cout1.click();
	}
}
