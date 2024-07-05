package allPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		Thread.sleep(2000);
//		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//zoom level 50%
		js.executeScript("document.body.style.zoom='50%'");
		js.executeScript("document.body.style.zoom='150%'");
	}
}
