package WebDriverProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Headless_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\venka\\Downloads\\geckodriver\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver =new FirefoxDriver(options);
		driver.get("http://demo.nopcommerce.com/");
		String Exp_Title="nopCommerce demo store";
		String Act_Title= driver.getTitle();
		if(Exp_Title.equals(Act_Title)==true) {
			System.out.println(Act_Title);
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fails");
		}
			

	}

}
