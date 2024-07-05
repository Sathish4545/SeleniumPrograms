package seleniumscriptpdf;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPages {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.nopcommerce.com/en/demo");
		Thread.sleep(2000);
		
		//Scrolling page down and print
		JavascriptExecutor jsedown = (JavascriptExecutor)driver;


//		jsedown.executeScript("window.scrollBy(0,1700)", "");
//		System.out.println(jsedown.executeScript("return window.pageYOffset;"));

		
//		jsedown.executeScript("window.scrollBy(0,1500)", "");
//		System.out.println(jsedown.executeScript("return window.pageYOffset;"));
		
		//Scroll Down
		//jsedown.executeScript("scroll(0,250)"); //Y value 250 is altered
		
		//Scroll Up
		//jsedown.executeScript("scroll(350,0)"); //X value 350 is altered
	
	
		//Full scroll to bottom in slow motion:
			for (int second = 0;; second++) {
			if(second >=60){
			break;
			}
			jsedown.executeScript("window.scrollBy(0,400)", ""); //y value '400' can be altered
			Thread.sleep(3000);
			
			}
			driver.close();
	
	}
	
}
