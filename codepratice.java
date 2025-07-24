import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class codepratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wedbriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromdriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	    driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	    driver.findElement(By.className("signInBtn")).click();
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sdss");
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("aaaa@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("2123123123");
	    
	   // driver.findElement(By.cssSelector("/button[class='go-to-login-btn']")).click();
	    driver.findElement(By.className("go-to-login-btn")).click();
	    
	   // driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	    
	    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.className("signInBtn")).click();
	    
	    

	                                     
	}
	
	

}
