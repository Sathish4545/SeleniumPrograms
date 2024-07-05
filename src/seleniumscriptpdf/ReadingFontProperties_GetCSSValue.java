package seleniumscriptpdf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadingFontProperties_GetCSSValue {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://only-testing-blog.blogspot.com/2014/05/login.html");
				
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void Text() {
		WebElement text = driver.findElement(By.xpath("//h1[normalize-space()='Example Login Page']"));
		//Read font-size property and print It In console.
		String fontSize = text.getCssValue("font-size");
		System.out.println("Font size is---> "+fontSize);
		
		
		String displayText = text.getCssValue("display");
		System.out.println("Diplay---> "+displayText);
		
		
		//Read color property and print It In console.
		String colortext = text.getCssValue("color");
		System.out.println("Color---> "+colortext);
		
		
		//Read font-family property and print It In console.
		String fontFamily = text.getCssValue("font-family");
		System.out.println("Font family ------> "+fontFamily);
		
		//Read text-align property and print It In console. 
		String fonttxtAlign = text.getCssValue("text-align");
		System.out.println("Text align---> "+fonttxtAlign);
	}
}
