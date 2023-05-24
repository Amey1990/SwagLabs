package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AddToCart;
import com.qa.pageLayer.CheckOutInfo;
import com.qa.pageLayer.Checkout;
import com.qa.pageLayer.Finish;
import com.qa.pageLayer.LogInPage;
import com.qa.testbase.TestBase;

public class LogInPageTest extends TestBase{
	@Test
	public void verifyLogin() throws InterruptedException
	{
		LogInPage login = new LogInPage();
		login.enterusername("standard_user");
		login.enterpassword("secret_sauce");
		login.clickOnLoginButton();
		
		Thread.sleep(3000);
		
		AddToCart add = new AddToCart();
		add.addtocart();
		
		Thread.sleep(3000);
		
		Checkout check = new Checkout();
		check.checkout();
		
		Thread.sleep(3000);
		check.checkout1();
		
		Thread.sleep(3000);
		CheckOutInfo checkout= new CheckOutInfo();
		checkout.FirstName("Amey");
		checkout.LastName("Kulkarni");
		checkout.Zip("415002");
		Thread.sleep(1000);
		checkout.Continue();
		
		Thread.sleep(3000);
		Finish f=new Finish();
		f.Finish1();
	}
}
