package deep1.gittest1;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest {
	
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





