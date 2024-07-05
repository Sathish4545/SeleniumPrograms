package seleniumscriptpdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumScriptsBasics {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Get and store page details
	String title = driver.getTitle();
	System.out.println(title);
	
	//get URL
	String CurrentURL = driver.getCurrentUrl();
	System.out.println("Current page URL is---> " +CurrentURL);
	
	 //Get and store domain name in variable using JavaScript Executor
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	String domain = (String)jse.executeScript("return document.domain");
	System.out.println("Domain using JS---> " +domain);
	
	// Checked for search box is enabled or not
	 if(driver.findElement(By.name("q")).isEnabled()) {
		 System.out.println("Search box is enabled");
	 }else {
		 System.out.println("Search box is not enabled");
	 }
	
	// Pass the Test - "WebDriver Test Successful" to search box
	driver.findElement(By.name("q")).sendKeys("Selenium"); 
	 try {
		 Thread.sleep(2000);
	 }
	 catch(Exception e){
		 System.out.println("Some problem occured");
	 }
	// clicking the search button
	driver.findElement(By.xpath("//span[@class='ExCKkf z1asCe rzyADb']//*[name()='svg']")).click();
	//enter text
	driver.findElement(By.name("q")).sendKeys("Selenium topics");
	
	//Add implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//Navigate back and forward
	driver.navigate().back();
	try {
		Thread.sleep(3000);
	}
	catch(Exception e) {
		System.out.println("Some problem occured");
	}
	System.out.println("Back navigation is done");
	
	driver.navigate().forward();
	System.out.println("Forward navigation is done");
	 
	}
}
