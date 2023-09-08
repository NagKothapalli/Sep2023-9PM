package inheritanceByObject;

import org.junit.Test;

public class ReusableComponents
{
	public ReusableComponents()
	{
		System.out.println("Open Google Chrome as default browser");
		System.out.println("Delete all Temp records");
	}
	public ReusableComponents(String browser)
	{
		System.out.println("Open Browser : " + browser);
		System.out.println("Delete all Temp records");
	}
	//*********************Reusable Component *******************
	
	public void launchApplication(String url)
	{
		//10 - 15 lines of code
		System.out.println("Launch Application :" + url);
	}
	void loginToApplication(String username,String password)
	{
		System.out.println("Login To Application with :" + username + "--" + password);
	}
	void logoutFromApplication()
	{
		//10 - 15 lines of code
		System.out.println("Logout From Application");
	}
	protected void closeApplication()
	{
		System.out.println("Close Application");
	}
	public void compose()
	{
		System.out.println("Compose Email");
	}
	public void send()
	{
		System.out.println("Send Email");
	}
	void open()
	{
		System.out.println("Open Email");
	}
	protected void reply()
	{
		System.out.println("Reply To Email");
	}
	public void forward()
	{
		System.out.println("Forward Email");
	}
	void delete()
	{
		System.out.println("Delete Email");
	}
	
}
