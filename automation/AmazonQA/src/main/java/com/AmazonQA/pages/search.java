package com.AmazonQA.pages;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class search {
	WebDriver driver;
	public search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchbar;

	public WebElement getSearchBar() {
		return searchbar;
	}
	
    @FindBy(xpath="//*[@id='nav-search-submit-button']")
    private WebElement searchIcon;	
    
    public WebElement getSearchIcon() {
    	return searchIcon;
    }
    
//    @FindBy(xpath="//span[@class='a-truncate-full a-offscreen' and text()='Unit Testing Principles, Practices, and Patterns: Effective testing styles, patterns, and reliable automation for unit testing, mocking, and integration testing with examples in C#']")
//    private WebElement bookName;
//    public WebElement getBook() {
//    	return bookName;
//    }
        
        
    @FindBy(xpath="//input[@id='add-to-cart-button']")
    private WebElement cart;
    
    public WebElement getCart() {
    	return cart;
    }
    
    @FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
    private WebElement Checkout;
    public WebElement getCheckout() {
    	return Checkout;
    }
        
    public void searchItem() throws InterruptedException {
		Thread.sleep(1000);
		getSearchBar().sendKeys("qa testing for beginners");
		getSearchIcon().click();
		Thread.sleep(1000);
		
		WebElement ele =driver.findElement(By.xpath("//*[text()='Unit Testing Principles, Practices, and Patterns: Effective testing styles, patterns, and reliable automation for unit testing, mocking, and integration testing with examples in C#']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", ele);
	    Thread.sleep(1000);

	    String Actualprice= driver.findElement(By.xpath("//span[text()='$47.49']" )).getText();
	    System.out.println(Actualprice);
	    String Expectedprice= driver.findElement(By.id("newBuyBoxPrice")).getText();
	    Assert.assertEquals(Actualprice, Expectedprice);
	  
	     
	    JavascriptExecutor scrollsdown =(JavascriptExecutor)driver;
		scrollsdown.executeScript("window.scrollBy(0,500)");
		
		getCart().click();
		 //Asserting price in the cart page
		String ExpectedPriceCart=driver.findElement(By.xpath("//span[@class='a-color-price hlb-price a-inline-block a-text-bold' and text()='$47.49']")).getText();
		 Assert.assertEquals(Actualprice,ExpectedPriceCart);
		    

		getCheckout().click();
    }
}
