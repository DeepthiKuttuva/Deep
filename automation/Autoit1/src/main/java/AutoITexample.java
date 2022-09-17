import java.io.IOException;		
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AutoITexample{				
public static void main(String[] args) throws IOException, InterruptedException {		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_90\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();			
    driver.get("http://demo.guru99.com/test/autoit.html");			
    //driver.findElement(By.id("postjob")).click();			
    JavascriptExecutor scrollsdown =(JavascriptExecutor)driver;
	scrollsdown.executeScript("window.scrollBy(0,500)");
    Thread.sleep(1000);
    driver.findElement(By.id("postjob")).click();	

    driver.switchTo().frame("JotFormIFrame-72320244964454");
    WebElement username= driver.findElement(By.id("input_3"));    
    username.sendKeys("DEE");
//    Actions builder=new Actions(driver);
//    Action action= builder.moveToElement(username).click().keyDown(username,Keys.SHIFT).sendKeys(username,"kkkkda").keyUp(username,Keys.CONTROL).build();
//    //action.perform();
      
    driver.findElement(By.id("input_4")).sendKeys("test.test@gmail.com");					
    //driver.findElement(By.id("input_5")).click();	
    WebElement elementUpload = driver.findElement(By.name("q5_typeA"));
	Actions act = new Actions(driver);
	act.click(elementUpload).perform();
    // below line execute the AutoIT script .
     Runtime.getRuntime().exec("C:\\Users\\venka\\OneDrive\\Desktop\\FileUpload.exe2");		
    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
    driver.findElement(By.id("input_2")).click();
   // driver.close();
     }
}
