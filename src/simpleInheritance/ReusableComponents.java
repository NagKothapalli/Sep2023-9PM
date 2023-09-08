package simpleInheritance;

import org.junit.Test;

public class ReusableComponents {

	public ReusableComponents() {
		System.out.println("Open Google Chrome as Default browser");
	}

	public ReusableComponents(String browser) {
		System.out.println("Open Browser :" + browser);
	}
	// *********************Reusable Component *******************

	public void launchApplication() {
		// 10 - 15 lines of code
		System.out.println("Launch Application");
	}

	void loginToApplication() {
		System.out.println("Login To Application");
	}

	void logoutFromApplication() {
		// 10 - 15 lines of code
		System.out.println("Logout From Application");
	}

	protected void closeApplication() {
		System.out.println("Close Application");
	}

	public void compose() {
		System.out.println("Compose Email");
	}

	public void send() {
		System.out.println("Send Email");
	}

	void open() {
		System.out.println("Open Email");
	}

	protected void reply() {
		System.out.println("Reply To Email");
	}

	public void forward() {
		System.out.println("Forward Email");
	}

	void delete() {
		System.out.println("Delete Email");
	}

}
