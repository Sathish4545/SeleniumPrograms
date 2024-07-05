package allPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class JSE {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
//		driver.findElement(By.id("name")).sendKeys("John");
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		Using JSE we enter the data
		js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox);	
		
		
//		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		WebElement clickac = driver.findElement(By.xpath("//input[@id='male']"));
		//click action using JSE
		js.executeScript("arguments[0].click()", clickac);

	}
}
