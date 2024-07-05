package allPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.nopcommerce.com/en/demo");
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//Scroll down by pixel number --1st method
		
		/*
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		
		//2nd method--scroll the page till element is visible
	/*	WebElement downloadTxt = driver.findElement(By.xpath("//strong[normalize-space()='Download']"));
		js.executeScript("arguments[0].scrollIntoView();", downloadTxt);
		System.out.println(js.executeScript("return window.pageYOffset"));
		*/
		
		//3rd method--- scroll down till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		Thread.sleep(2000);
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
	
	
	//If we perform action in Horizontal we can use pageXOffset in Place of pageYOffset and inplace of scrollHeight we can use scrollWidth
	
	
	}
}
