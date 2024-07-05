package seleniumscriptpdf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HighlghtingElementAndUnexpecctedAlert {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("maximize");
		Thread.sleep(2000);
		driver.navigate().to("http://only-testing-blog.blogspot.in/2014/06/alert_6.html");
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Close broswer");
	}
	@Test
	public void test() throws Exception{
		{
			//To handle unexpected alert on page load
			 try {
				 driver.switchTo().alert().dismiss();
			 }catch(Exception e) {
				 System.out.println("Some problem occured");
			 }
			 
			 HighlightMyElement(driver.findElement(By.xpath("//input[@name='fname']")));
			 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("fName");
			 
			 HighlightMyElement(driver.findElement(By.xpath("//input[@name='lname']")));
			 driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("lname");
			 
			 driver.findElement(By.xpath("//input[@id='submitButton']")).click();
			
			 
		}	
	}
	public void HighlightMyElement(WebElement element) throws Exception{
		for (int i = 0; i < 10; i++) {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].setAttribute('style',arguments[1]);",element, "color: red; border: 3px solid yellow;");
			 Thread.sleep(2000);
			 js.executeScript("arguments[0].setAttribute('style',arguments[1]);",element, "");

		}
		
	}	
	}

