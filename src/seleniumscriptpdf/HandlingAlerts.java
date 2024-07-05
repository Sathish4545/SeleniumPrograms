package seleniumscriptpdf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;


public class HandlingAlerts {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present version chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//Enter URL
		driver.navigate().to("https://only-testing-blog.blogspot.com/2014/01/textbox.html?");
		Thread.sleep(1000);
		
// Observe in that page have "3 buttons there" 1. Show Me Confiramation 2. Show Me Alert 3. Show Me Prompt
		
//Alert Pop up Handling - click the Show Me Alert Button
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		String showmeText = al.getText();
		System.out.println(showmeText);
		al.accept();
		System.out.println("Clicking on alert OK btn");
		Thread.sleep(2000);
		
//Confirmation Pop up Handling - CLick the Show Me Confiramation Button
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).
		click();
		 Alert A2 = driver.switchTo().alert();
//		 String Alert2 = A2.getText();
//		 System.out.println(Alert2);
		 System.out.println(A2.getText());
		 Thread.sleep(2000);
		 //click on the cancel btn
		 A2.dismiss();
		 System.out.println("Clicking on alert CANCEL btn");
	
		
//Prompt Pop up Handling - Click the Show Me Prompt button
		 driver.findElement(By.xpath("//button[normalize-space()='Show Me Prompt']")).click();
		 Alert A3 = driver.switchTo().alert();
		 Thread.sleep(2000);
		 //Get text
		 System.out.println(A3.getText());
		 
		//To type text In text box of prompt pop up.
		 A3.sendKeys("This Is John");
		 System.out.println("Enter data is done");
		 Thread.sleep(2000);
		 A3.accept();
		 
	}
}
