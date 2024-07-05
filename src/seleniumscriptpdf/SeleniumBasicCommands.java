package seleniumscriptpdf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands {
	public static void main(String[] args) throws Exception{
		//open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.google.com/");
		driver.get("http://www.automationpractice.pl/index.php");
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		
		//Get and store page title in to variable 
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+ title);
		
		//current url
		String URL = driver.getCurrentUrl();
		System.out.println("The current url title is: "+URL);
			
		
		//Get and store domain name in variable using JavaScript Executor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String DomainUsingJs = (String)js.executeScript("return document.domain");
//		System.out.println(DomainUsingJs);
		
		WebElement txt = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value','Selenium')", txt );
		System.out.println("Text is enter correctly...-");
		
//		Using JSE we enter the data
//		js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox);	
		
	
		
		
	}
}