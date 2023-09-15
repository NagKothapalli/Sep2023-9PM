package seleniumPractice;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation 
{
	String expectedTitle = "Gmail";
	String name; //null
	WebDriver driver ; //null
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-116\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
	}
	
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");//logger
		driver.get("https://www.apsrtconline.in/");
	}
	
	@Test
	public void bookBusTicket()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();		
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.findElement(By.xpath("//a[text()='22']")).click(); //Date Hard coded
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	
	
	
	
	

}
