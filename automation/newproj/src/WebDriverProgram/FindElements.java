package WebDriverProgram;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class FindElements {
 
   public static void main(String[] args){
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
   
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("http://www.calculator.net");
      java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println("Number of Links in the Page is " + links.size());
      
      for (int i = 0; i<links.size(); i=i+1) {
         System.out.println("Name of Link " + i   +  links.get(i).getText());
         }
      WebElement w= driver.findElement(By.xpath("//input[@id='scirdsettingd' and @value='deg']//following::label"));
      w.click();
     System.out.println(w.getText()); 
     
      WebElement w1=driver.findElement(By.xpath("//input[@id='scirdsettingr' or @value='rad']//preceding::label"));
      w1.click();
      System.out.println(w1.getText()); 
      WebElement number=driver.findElement(By.xpath("//span[@class='scinm' and text()='3']"));
      number.click();
      WebElement exp=driver.findElement(By.xpath("(//span[@class='sciop'])[7]"));
      exp.click();
      driver.findElement(By.xpath("//span[@class='scinm' and text()='3']")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//      WebElement ele=  driver.findElement(By.xpath("//div[@id='sciInPut']//following::sup"));
	//      Actions action = new Actions(driver);
	//      action.moveToElement(ele);
	//     // WebElement ele=  driver.findElement(By.xpath("//div[@id='sciInPut']//following::sup"));
	//     // JavascriptExecutor jse = (JavascriptExecutor)driver;
	//		//jse.executeScript("arguments[0].click()", ele);
	//		ele.sendKeys("1");
      driver.findElement(By.xpath("//span[text()= '=']")).click();
      driver.findElement(By.xpath("(//span[@class='sciop'])[last()]")).click();
      WebElement ele = driver.findElement(By.xpath("//span[@class='scieq' and text()='AC']//following-sibling ::span"));
      ele.click();
      System.out.println(ele.getText());
      
      
      }
   }





