package seleniumscriptpdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GeneratingMouseHover {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://only-testing-blog.blogspot.com/p/mouse-hover.html");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Browser closed");
	}
	
	@Test
	public void mouseHoverText() throws Exception{
		Actions ac = new Actions(driver);
		/*driver.findElement(By.xpath("//div[normalize-space()='E-Commerce']"));
		Thread.sleep(1000);
		ac.moveToElement(driver.findElement(By.xpath("//body"))).click().perform();
		Thread.sleep(2000);
		System.out.println("Performing mouse hover action");
*/
		
	/*	driver.findElement(By.xpath("//div[@id='menu1']/div"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a"))).click().perform();
		*/
		
		driver.findElement(By.xpath("//*[@id=\"menu1\"]/div[1]"));
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu1choices\"]/a[2]"))).click().perform();
		
		
	}
	
	
}
