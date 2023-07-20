package dashboardTrial;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shubham java study\\chromedriver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.cometchat.com/signup");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,400)");
		
		driver.close();
	}

}
