package WebDriverProgram;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Switch_To_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
       // System.out.println(driver.getTitle());
        Set <String>s= driver.getWindowHandles();
        for(String i:s) {
        	System.out.println(i);//id of the window
        	String t=driver.switchTo().window(i).getTitle();// title of the window
        	System.out.println(t);
        }
	}

}
