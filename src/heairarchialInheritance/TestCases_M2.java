package heairarchialInheritance;

import org.junit.Test;
//               child                parent
public class TestCases_M2 extends ReusableComponents
{
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
