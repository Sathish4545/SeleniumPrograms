package allPrograms;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://demo.opencart.com/");
		//1)Take full page screenshot
		/*
		TakesScreenshot ts = (TakesScreenshot)driver;
		File soursefile = ts.getScreenshotAs(OutputType.FILE);
		//File targetfile = new File("C:\\Users\\Sathish\\eclipse-workspace\\SeleniumPavanSir\\Screenshots\\fullpage.png");
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\\\fullpage.png");
		
		soursefile.renameTo(targetfile); //copy sourcefile to targetfile
		*/
		
		//2)Capture screenshot from the specific section
	
		/*WebElement featureproducts = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]"));
		File soursefile = featureproducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\featureproducts.png");
		soursefile.renameTo(targetfile);
		*/
		
		//3)Capture the screenshot of web element
		WebElement logo = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/a/img"));
		File soursefile =logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\log.png");
		soursefile.renameTo(targetfile);
		
		driver.quit();
	}
}
