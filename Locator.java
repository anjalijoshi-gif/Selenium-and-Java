import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wedbriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("anjali@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("sssss");
		driver.findElement(By.className("signInBtn")).click();	
		}

}
