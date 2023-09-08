package basicConcepts;

import org.junit.Test;

public class GmailAutomation
{
//*************************Test Cases *****************************
	@Test
	public void composeAndSendAnEmail()
	{
		//launch , login , compose , send , logout , close
		System.out.println("Test Case : Compose And Send An Email");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail()
	{
		//launch , login , open , reply , logout , close
		System.out.println("Test Case : Reply to An Email");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void forwardAnEmail()
	{
		//launch , login , open , forward , logout , close
		System.out.println("Test Case : Forward An Email");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		//launch , login , open , delete , logout , close
		System.out.println("Test Case : Delete An Email");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	
	//*********************Reusable Component *******************
	
	public void launchApplication()
	{
		//10 - 15 lines of code
		System.out.println("Launch Application");
	}
	private void loginToApplication()
	{
		System.out.println("Login To Application");
	}
	void logoutFromApplication()
	{
		//10 - 15 lines of code
		System.out.println("Logout From Application");
	}
	private void closeApplication()
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
	private void reply()
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
