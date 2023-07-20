package dashboardTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Shubham java study\\chromedriver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		
		driver.findElement(By.xpath("//a[@id='flights']")).click();
		
		WebElement drop = driver.findElement(By.xpath("//select[@title='Cabin class']"));
		
		Thread.sleep(2000);
		
		Select s = new Select(drop);
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Business");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		// we can aslo use disselect methods
	}

}
