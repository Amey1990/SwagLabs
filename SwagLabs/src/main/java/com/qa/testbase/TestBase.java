package com.qa.testbase;

import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Logger logger ;

	
	@BeforeClass
	public void start()
	{
	logger=LogManager.getLogger("23 May 2023 16:20");
	
	}
	@AfterClass
	public void stop()
	{
	logger.info("Framework Execution stopped");	
	}
	
	@BeforeMethod
	public void setUp()
	{
		String br = "chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			logger.info("Chrome launches");
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide valid browser name");
		}
		driver.get("https://www.saucedemo.com/");
		logger.info("url launches");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		logger.info("Maximized window");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("provided waits");
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
		logger.info("Chrome closed");
	}
}
