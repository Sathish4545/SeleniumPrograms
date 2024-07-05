package seleniumscriptpdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForward {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Open the URL
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.get("https://selenium-venkat.blogspot.com/p/index_4.html");
		Thread.sleep(3000);
		
		//Navigate back to the google window
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Back navigation is done");
		
		driver.navigate().forward();
		System.out.println("Forward navigation is done");
	}
}
