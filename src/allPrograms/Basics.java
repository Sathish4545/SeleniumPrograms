package allPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\Updated driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open 5 times
		for(int i=1; i<=5; i++) {
			driver.get("https://www.google.com/");
			System.out.println("Browser open");
		}
		Thread.sleep(1000);
		driver.close();
	}
}
