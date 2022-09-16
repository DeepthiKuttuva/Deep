package WebDriverProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebDriverProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("deepthi.aries@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Prachu12345*");
		driver.findElement(By.name("login")).click();
		String Exp_Title ="Facebook - Log In or Sign Up";
		String Act_Title = driver.getTitle();
		if(Exp_Title.equals(Act_Title)==true) {
			System.out.println("Test is passed");
			}
			else {
				System.out.println("Test is failed");
			}
		}
		

}
