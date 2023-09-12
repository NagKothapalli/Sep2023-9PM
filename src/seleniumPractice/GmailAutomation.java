package seleniumPractice;

import java.util.List;

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
		nameElement.clear();
		driver.findElement(By.id("identifierId")).sendKeys("ravi@abc.com");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(1); // 0 1 2
		element.click();
	}
	@Test
	public void createAccount()
	{
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		int cnt = elements.size();
		for(int i=0;i<cnt;i++) // i= 0 
		{
			WebElement element = elements.get(i);
			String text = element.getText();
			if(text.trim().equals("Create account")) {
				element.click();
				break;
			}
		}
				
	}
	//Selectors / Locators : ID , Name , Class , cssSelector , tagname , linkText , partialLinkText , xpath
	@Test
	public void learnMore()
	{
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); int cnt =
		 * elements.size(); for(int i=0;i<cnt;i++) // i= 0 { WebElement element =
		 * elements.get(i); String text = element.getText();
		 * if(text.trim().equals("Learn more")) { element.click(); break; } }
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
