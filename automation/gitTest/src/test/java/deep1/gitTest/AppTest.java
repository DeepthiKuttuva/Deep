package deep1.gitTest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	public WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		String eTitle="Meet Guru99";
		String aTitle=driver.getTitle();	
		driver.get("http://www.guru99.com");
		driver.manage().window().maximize();
		if(eTitle.equals(aTitle)) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}
		driver.close();
	}}


