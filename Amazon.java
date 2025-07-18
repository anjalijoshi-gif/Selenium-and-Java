import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("windows.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedrver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		driver.findElement(By.xpath("//a[@class=\"nav-a  \"]")).click();
				
	  //driver.findElement(By.name("inputPassword")).sendKeys("sssss");
	}
	

}
