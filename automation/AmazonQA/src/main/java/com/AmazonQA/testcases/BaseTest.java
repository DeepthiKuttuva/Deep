package com.AmazonQA.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	public WebDriver driver;
	//public  WebDriver driver ;
	
		
	
	public void openLink()throws Exception {
		try {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_90\\chromedriver.exe");
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com");
		

	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@BeforeMethod
	public void setup()  throws Exception {
		openLink();
//		
	}
	@AfterMethod
	public void closeLink() throws Exception {
		//driver.close();
	}
	

}
                                  