package com.AmazonQA.testcases;
import org.testng.annotations.Test;
import com.AmazonQA.pages.search;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SearchTest extends BaseTest {
@Test
public void test() throws InterruptedException {
	Logger log =(Logger) LogManager.getLogger(SearchTest.class);
	search searchobj= new search(driver);
	  searchobj.searchItem();
	  log.trace("amazon website is opened");
	  log.info("Book name is entered");
	  log.info("Price is validated");
	  log.info("Item is added and then proceed to checkout is clicked");
	  
	
}
  
}
