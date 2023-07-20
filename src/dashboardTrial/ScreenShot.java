package dashboardTrial;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shubham java study\\chromedriver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.cometchat.com/login");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dec = new File("C:\\Users\\Admin\\eclipse-workspace\\DemoProject\\src\\dashboardTrial\\Screenshotsss.png");
		FileHandler.copy(src, dec);
		
		driver.close();
	}

}
