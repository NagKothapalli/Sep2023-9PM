package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation 
{
	String expectedTitle = "Gmail";
	String name; //null
	WebDriver driver ; //null
	Actions actions;//null
	ReadPropertiesUtility readPropertiesUtility;
	public ApsrtcAutomation()
	{
		/*
		 * if(name.equals("Ram")) //null.equals will give NullPointerException {
		 * System.out.println("Give him a pen"); }
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-116\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
		actions = new Actions(driver);
		readPropertiesUtility = new ReadPropertiesUtility("D:\\WorkSpace\\Java\\Sep2023-9PM\\TestData\\Apsrtc.properties");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //dynamic wait
	}
	
	@Before
	public void launchApplication() throws IOException
	{
		System.out.println("Test Case : Launch Application");//logger		
		//driver.get("https://www.apsrtconline.in/"); //null.get()
		driver.get(readPropertiesUtility.getData("URL"));
	}
	
	
	
	@Test
	public void readTestData() throws IOException
	{
		FileInputStream myfile = new FileInputStream("D:\\WorkSpace\\Java\\Sep2023-9PM\\TestData\\MyTestData.properties");
		Properties prop = new Properties();
		prop.load(myfile);
		String url = prop.getProperty("URL");
		System.out.println(url);
		System.out.println(prop.getProperty("UserName"));
		System.out.println(prop.getProperty("JDate"));
	}
	//To perform keyboard and mouse events we have actions class in selenium webdriver
	@Test   // Here Data is hard coded
	public void bookBusTicket_1() throws IOException, InterruptedException
	{		
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@value='Depart On']")).click();
		driver.findElement(By.xpath("//a[text()='28']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();		
	}
	//687687 ,  hkhkj , jhkjhkhj
	@Test // Here reading the data dynamically from a data source
	public void bookBusTicket_2() throws IOException, InterruptedException
	{		
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(readPropertiesUtility.getData("FromCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(readPropertiesUtility.getData("ToCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@value='Depart On']")).click();
		String jd = readPropertiesUtility.getData("JDate");
		driver.findElement(By.xpath("//a[text()='"+jd+"']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();		
	}
	
	@Test // Here reading the data dynamically from a data source
	public void bookBusTicket_3() throws IOException, InterruptedException
	{		
		findElement("//input[@name='source']").sendKeys(readPropertiesUtility.getData("FromCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		findElement("//input[@name='destination']").sendKeys(readPropertiesUtility.getData("ToCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		findElement("//input[@value='Depart On']").click();
		String jd = readPropertiesUtility.getData("JDate");
		findElement("//a[text()='"+jd+"']").click();
		findElement("//input[@name='searchBtn']").click();	
	}
	@Test // Here reading the data dynamically from a data source
	public void bookBusTicket_4() throws IOException, InterruptedException
	{		
		getElement("//input[@name='source']").sendKeys(readPropertiesUtility.getData("FromCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		getElement("//input[@name='destination']").sendKeys(readPropertiesUtility.getData("ToCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		getElement("//input[@value='Depart On']").click();
		String jd = readPropertiesUtility.getData("JDate");
		getElement("//a[text()='"+jd+"']").click();
		getElement("//input[@name='searchBtn']").click();	
	}
	
	String sourceXpath = "//input[@name='source']";
	String destinationXpath = "//input[@name='destination']";
	String openCalXpath = "//input[@value='Depart On']";
	String searchXpath = "//input[@name='searchBtn']";
	
	@Test // Here reading the data dynamically from a data source
	public void bookBusTicket_5() throws IOException, InterruptedException
	{		
		getElement(sourceXpath).sendKeys(readPropertiesUtility.getData("FromCity"));
		clickEnter();
		getElement(destinationXpath).sendKeys(readPropertiesUtility.getData("ToCity"));
		clickEnter();
		getElement(openCalXpath).click();
		String jd = readPropertiesUtility.getData("JDate");
		getElement("//a[text()='"+jd+"']").click();
		getElement(searchXpath).click();	
	}
	
	public void clickEnter()
	{
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	public WebElement findElement(String myxpath)
	{
		//WebElement sourceCity = driver.findElement(By.xpath(myxpath));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath))));
	}

	public WebElement getElement(String myxpath) //utility function
	{
		//WebElement sourceCity = driver.findElement(By.xpath(myxpath));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath))));
	}
	@Test
	public void bookBusTicket() throws IOException, InterruptedException
	{
		//Thread.sleep(30000);  //fixed wait / blind wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //dynamic wait
		//Explicit wait
		WebElement sourceCity = driver.findElement(By.xpath("//input[@name='source']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(sourceCity)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sourceCity)).sendKeys("HYDERABAD");
		System.out.println("Test Case : Book Bus Ticket");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys(readPropertiesUtility.getData("FromCity"));		
		//Actions actions = new Actions(driver);//1234
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(readPropertiesUtility.getData("ToCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();		
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		selectJDate(readPropertiesUtility.getData("JDate")); //we can read this value from a input file 
		//driver.findElement(By.xpath("//a[text()='22']")).click(); //Date Hard coded
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	@Test
	public void bookBusTicketNew() throws IOException, InterruptedException
	{
		getElement("//input[@name='source']").sendKeys(readPropertiesUtility.getData("FromCity"));
		System.out.println("Test Case : Book Bus Ticket");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		getElement("//input[@name='destination']").sendKeys(readPropertiesUtility.getData("ToCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();		
		getElement("//input[@name='searchBtn']").click();
		selectJDate(readPropertiesUtility.getData("JDate")); 
		getElement("//input[@name='searchBtn']").click();
	}
	
	
	public void selectJDate(String jDate)
	{
		//passing some string value dynamically in to the xpath in run time is called dynamic xpath
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();// "//a[text()='"+jdate+"']"
	}
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//input[@name='searchBtn1']"}
	//org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please select start place.}
	//java.lang.NullPointerException : null.equals will give NullPointerException
	//org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 114
	           //Current browser version is 116.0.5845.188 with binary path C:\Program Files\Google\Chrome\Application\chrome.exe 
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	@Test
	public void handleWebAlert()
	{
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		//Actions actions = new Actions(driver);//1234
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	@Test
	public void mouseEvents()
	{
		WebElement source = driver.findElement(By.xpath("//input[@name='source']"));
		//actions.moveToElement(source).build().perform();
		//actions.moveToElement(source).click().build().perform();
		//actions.moveToElement(source).sendKeys("HYDERABAD").build().perform();
		//actions.moveToElement(source).doubleClick().build().perform();
		//actions.moveToElement(source).contextClick().build().perform();
		actions.moveToElement(source).click().sendKeys("HYDERABAD").doubleClick().contextClick().build().perform();
		//actions.dragAndDrop(source, source).build().perform();
	}
	@Test
	public void handleMultipleWindows() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> windows = driver.getWindowHandles(); // Set is one of the class in java collections , it will allow unique values
		ArrayList<String> mywindows = new ArrayList<String>(windows); //ArrayList is also one of the class in java collections ,allows duplicate values , and we can read values with get() function
		mywindows.get(0); // session id of the first window
		System.out.println("Session ID of 1st :" + mywindows.get(0));  // first window
		System.out.println("Session ID of 2nd :" + mywindows.get(1)); //second window
		System.out.println("First window title :" + driver.getTitle());
		driver.switchTo().window(mywindows.get(1));
		System.out.println("Second window title :" + driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(mywindows.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(mywindows.get(1));
		Thread.sleep(4000);
		//driver.close();
		driver.quit();
		Thread.sleep(2000);
		driver.switchTo().window(mywindows.get(0));
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


class Action{
	
	public Action(WebDriver driver)
	{
		
	}
	
	
}




















