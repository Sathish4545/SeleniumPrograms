package allPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		//By using ChromeOptions we can achieve headless testing
		ChromeOptions options = new ChromeOptions(); //Create ChromeOptions Class
		options.addArguments("--headless=new"); //setting for headless testing
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		
		//Validate title should be "Your store"
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Failed");
		}
		driver.close();
	}
}
