package seleniumPractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	String expectedTitle = "Gmail";
	String name; //null
	WebDriver driver ; //null
	public GmailAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-116\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
	}
	@Before
	public void launchApplication()
	{
		System.out.println("Welcome to Selenium Automation");
		//Constructor of chromedriver will open an empty google chrome browser
		//ChromeDriver driver = new ChromeDriver();
		name  = "Ravi"; // local variable 
		System.out.println(name);
		
		driver.get("https://gmail.com");	//1234	
		String sessionID = driver.getWindowHandle();
		System.out.println("My Current SessionID :" + sessionID);
		String actualTitle = driver.getTitle();
		System.out.println("My window title :" + actualTitle);
		String myurl = driver.getCurrentUrl();
		System.out.println("My URL :" + myurl);
		//validation 
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title Validation Passed");
		}
		else {
			System.out.println("Title Validation Failed");
		}
		Assert.assertEquals(expectedTitle, actualTitle);
		
		//driver.findElement(By.name("identifier")).sendKeys("Ram@krishna.com");	
		
		
		
	}
	@Test
	public void loginToApplication()
	{
		System.out.println("Test Case : Login To Application");
		name = "Ram";
		System.out.println(name);
		By nameObj = By.name("identifier");
		WebElement nameElement = driver.findElement(nameObj);//1234
		nameElement.click();
		nameElement.sendKeys("sdsdsdsdfsfsdfsd");
		nameElement.clear();
		nameElement.sendKeys("nag022@gmail.com");	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
