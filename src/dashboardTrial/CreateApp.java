package dashboardTrial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shubham java study\\chromedriver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://app.cometchat.com/login");

		driver.findElement(By.id("email")).sendKeys("shubham.toke+1@cometchat.com");
		driver.findElement(By.id("password")).sendKeys("Shubhtoke@15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//div[@style='display: flex;'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Application Name']")).sendKeys("Automated app1");
		
		driver.findElement(By.xpath("(//div[@class='radioLabelText'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
//		driver.close();
		
		
		
	}

}
