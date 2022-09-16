package WebDriverProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options =new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver =new ChromeDriver(options);
		driver.get("http://demo.nopcommerce.com/");
		String Exp_Title="nopCommerce demo store";
		String Act_Title= driver.getTitle();
		if(Exp_Title.equals(Act_Title)==true) {
			System.out.println(Act_Title);
			System.out.println("Test pass");
		}
		else {
			System.out.println("test fail");
		}

	}

}
