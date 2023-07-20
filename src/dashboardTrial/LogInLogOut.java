package dashboardTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogInLogOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Shubham java study\\chromedriver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.cometchat.com/login");
		
		driver.findElement(By.id("email")).sendKeys("shubham.toke+1@cometchat.com");
		driver.findElement(By.id("password")).sendKeys("Shubhtoke@15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")).click();
		Thread.sleep(2000);
		
	
		
		driver.findElement(By.xpath("//img[@alt='customer avatar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='style_topLink__XNljQ'])[4]")).click();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
