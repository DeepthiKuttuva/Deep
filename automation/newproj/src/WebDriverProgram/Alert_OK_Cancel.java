package WebDriverProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Alert_OK_Cancel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://demo.automationtesting.in/Alerts.html");
		//Alet with Okand Cancel
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		//*[@id="CancelTab"]/button
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		String ExpTextOK ="You pressed Ok";
		driver.switchTo().alert().accept();
		
		String ActText= driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).getText();
		System.out.println(ActText);
		if(ExpTextOK.equals(ActText)==true) 
		{
			System.out.println("Alert with Ok test passed");
		}
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		String ExpCancel= "You Pressed Cancel";
		driver.switchTo().alert().dismiss();
	  ActText= driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).getText();
	  System.out.println(ActText);
		if(ExpCancel.equals(ActText)==true)
		{
			System.out.println("Alert with cancel test passed");
		}

}
}