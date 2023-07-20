package dashboardTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Shubham java study\\chromedriver2\\chromedriver.exe"); 
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.cometchat.com/login");
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='cometchat']"));
		boolean logo = ele.isDisplayed();
		System.out.println("your logo is = "+ logo);
		
		System.out.println("your button is enabled = "+ ele.isEnabled());
		// System.out.println(ele.isSelected());
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/div/div/div[2]/h2[1]"));
		boolean loginSummary = ele1.isDisplayed();
		System.out.println("your login summary = "+ loginSummary);
		
		
		
		
		
//		driver.findElement(By.id("email")).sendKeys("shubham.toke@cometchat.com");
//		driver.findElement(By.id("password")).sendKeys("Shubhtoke@15");
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")).click();
		
	
	/*	
		
	//	driver.navigate().to("https://app.cometchat.com/login"); 	// same to open URL
		
		String url = driver.getCurrentUrl();				// to get current URL
		System.out.println(url);				
		
		System.out.println(driver.getCurrentUrl());			// same step to get current url
		
		System.out.println(driver.getTitle());				// to get title of the website
		
	//	Assert.assertEquals("cometchat", driver.getTitle());
		
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(6000);									// wait on the same page for 3 seconds
		*/
		
		
		driver.close();										// to close the current tab
	
		//driver.quit()										// to close all the tabs
	}

}
