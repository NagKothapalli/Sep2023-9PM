package rComponents;

import org.junit.Test;

public class ReusableComponents
{
	//*********************Reusable Component *******************
	
	public void launchApplication()
	{
		//10 - 15 lines of code
		System.out.println("Launch Application");
	}
	public void loginToApplication()
	{
		System.out.println("Login To Application");
	}
	protected void logoutFromApplication()
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
	public void open()
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
	protected void delete()
	{
		System.out.println("Delete Email");
	}
	
}
