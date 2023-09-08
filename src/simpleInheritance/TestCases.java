package simpleInheritance;

import org.junit.Test;
//             child                parent   - SIMPLE INHERITANCE
public class TestCases extends ReusableComponents
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
	

}
