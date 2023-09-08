package superMarket;

import org.junit.Test;

import interfaceConcept.ICalculator;
import interfaceConcept.MiniCalculator;

public class CustomerBill 
{
	@Test
	public void generateCustomerBill()
	{
		MiniCalculator mCalc = new MiniCalculator(); //ChromeDriver cDriver = new ChromeDriver();
		ICalculator iCalc = new MiniCalculator(); // WebDriver  driver = new ChromeDriver();  EdgeDriver(); .......
		mCalc.welcomeMessage();
		int prod1 = 122323332;
		int prod2 = 143232325;
		int bill = mCalc.addition(prod1, prod2);
		System.out.println("Customer Bill :" + bill);
		//iCalc.w
		
	}

}
