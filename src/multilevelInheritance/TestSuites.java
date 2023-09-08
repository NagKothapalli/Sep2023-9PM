package multilevelInheritance;

import org.junit.Test;
// TestSuites extends TestCases extends ReusableComponents
// A extends B extends C  -> A inherits C automatically
public class TestSuites extends TestCases//,ReusableComponents
{
	public TestSuites()
	{
		
	}
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		launchApplication();
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}

}
