package WebDriverProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_with_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Alert a= driver.switchTo().alert();
		a.sendKeys("deep");
		System.out.println(a.getText());
		a.accept();
		//html/body/div[1]/div/div/div/div[2]/div[3]/p
		
		String ExpText="Hello deep How are you today";
		String ActText= driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[3]/p")).getText();
		//driver.switchTo().alert().accept();
		if (ExpText.equals(ActText)==true) {
			System.out.println("alert with name" );
		}
		/*driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		driver.switchTo().alert().dismiss();*/
	}

}
