import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();

	driver.get("https://the-internet.herokuapp.com/dropdown");
	
	WebElement staticdropdown =  driver.findElement(By.id("dropdown"));
	Select dropdown = new Select(staticdropdown);

	dropdown.selectByIndex(1);
	
			
			
			
		

	}

}
