package WebDriverProgram;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FindElementsAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.amazon.com");
		List<WebElement> links=driver.findElements(By.tagName("span"));
		System.out.println("Number of links: " +links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println("name of the link : " +i + links.get(i).getText());
		}
		driver.close();
        
	}

}
