package dashboardTrial;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimentionAndPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Shubham java study\\chromedriver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.cometchat.com/login");
		
		Thread.sleep(2000);
		
		Dimension d = new Dimension (400,600);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		driver.close();
		
//		Point p = new Point (100,500);
//		driver.manage().window().setPosition(p);
		
		
	}

}
