package seleniumscriptpdf;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;



public class ScreenshotCapture {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		FileUtils.copyFile(screenshot, new File("C:\\Scee\\imaaa.bmp"));
		System.out.println("File saved in created folder");
		driver.close();
		System.out.println("Browser close");
	}
}
