package Advanced_Topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
		System.setProperty("webdriver.chrome.driver","./Drivers_Folder/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		// Go to URL
		driver.get("https://www.amazon.com/");
		 
		// Maximize Window
		driver.manage().window().maximize();

		//scripting languages all supports Eclipse IDE,Visual Studio 
		 
		// Create JavascriptExecutor object jes
		JavascriptExecutor jse = (JavascriptExecutor) driver;	 
		
		 
		// Scroll Down Page using Second way
		jse.executeScript("scroll(0, 5000);");
				
		Thread.sleep(5000);
				
		// Scroll Up Page using Second way
		jse.executeScript("scroll(0,-5000);");
				 
	}
}
