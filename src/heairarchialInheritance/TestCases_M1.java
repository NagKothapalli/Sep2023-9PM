package heairarchialInheritance;

import org.junit.Test;
//                child               parent
public class TestCases_M1 extends ReusableComponents
{
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

}
