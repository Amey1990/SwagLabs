package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class AddToCart extends TestBase{
	public AddToCart()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	private WebElement cart;
	
	public void addtocart()
	{
		cart.click();
	}
}
