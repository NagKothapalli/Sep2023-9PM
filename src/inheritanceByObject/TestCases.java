package inheritanceByObject;

import org.junit.Test;
//             child                parent   - SIMPLE INHERITANCE
public class TestCases //extends ReusableComponents
{
	//Modifier   ClassName    objName = new Constructor();
	public int num = 22;
	//public ReusableComponents  rc = new ReusableComponents();
	public ReusableComponents  rc = new ReusableComponents("firefox");
	//*************************Test Cases *****************************
	@Test
	public void composeAndSendAnEmail()
	{
		//launch , login , compose , send , logout , close
		System.out.println("Test Case : Compose And Send An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication("nag","1234");
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void replyToAnEmail()
	{
		//launch , login , open , reply , logout , close
		System.out.println("Test Case : Reply to An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication("nag","1234");
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
		
	}
	
	@Test
	public void forwardAnEmail()
	{
		//launch , login , open , forward , logout , close
		System.out.println("Test Case : Forward An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication("nag","1234");
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		//launch , login , open , delete , logout , close
		System.out.println("Test Case : Delete An Email");
		rc.launchApplication("https://gmail.com");
		rc.loginToApplication("nag","1234");
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	

}
