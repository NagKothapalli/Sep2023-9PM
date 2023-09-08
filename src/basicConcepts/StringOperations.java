package basicConcepts;

import org.junit.Test;

public class StringOperations
{
	
	String c = "JAVA";
	@Test
	public void basicOperations()
	{
		System.out.println("Original String :" + a);
		int len = a.length();
		System.out.println("Length of my string :" + len);
		String aT = a.trim();
		System.out.println("Length of the string after trim :" + aT.length());
		System.out.println("String after trim :" + aT);
		String aL = a.trim().toLowerCase();
		System.out.println("String a after lowercase :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String a after uppercase :"+ aU);
		
	}
	@Test
	public void stringContains() {
		
		//if(a.trim().contains(c.trim()))
		if(a.trim().toLowerCase().contains(c.trim().toLowerCase()))		{
			System.out.println("String A contains String C");
		}
		else {
			System.out.println("String A does not contains String C");
		}
	}
	
	//sub string
	@Test
	public void subStringOperation()
	{
		String a8 = a.trim().substring(8);
		System.out.println("Substring from 8th char :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("Substring from 0-8th char :" + a08);
		String m8 = substring(8);
		System.out.println("Substring from myclass :" + m8);
	}
	//String class overloaded the method substring
	public String substring(int beginIndex)
	{ 
		return null;		
	}
	public String substring(int beginIndex,int endIndex)
	{ 
		return null;		
	}
	
	//String a = "       Selenium With Java                 ";
	String b= "Selenium With JAVA   ";
	//Both must be of type strings  , same in length , same in case , same in char sequence
	@Test
	public void stringComparision()
	{
		System.out.println(a);
		System.out.println(b);
		//boolean result = a.equals(b);	
		//boolean result = a.trim().equals(b.trim());
		System.out.println(a.trim());
		System.out.println(b.trim());
		//boolean result = a.trim().toLowerCase().equals(b.trim().toLowerCase());
		//boolean result = a.trim().toUpperCase().equals(b.trim().toUpperCase());
		boolean result = a.trim().equalsIgnoreCase(b.trim());
		if(result == true)
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
	}
	
	//split 
	String a = "       Selenium With Java                 ";
	@Test
	public void splitOperation()
	{
		String[] words = a.trim().split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		
	}
	@Test
	public void characterAtOperaton()
	{
		char c1 = a.trim().charAt(9);
		System.out.println(c1);
	}
	
	//WAP to find a particular char is there in the given string 
	@Test
	public void findChar()  // i
	{
		boolean result = false;
		for(int i=0;i<a.trim().length();i++)
		{
			char myChar = a.trim().charAt(i);
			if(myChar == 'e')
			{
				result = true;
				break;
			}
		}
		System.out.println(result);
	}
	
	
	@Test
	public void findCharCount()  // i
	{
		int count =0;
		for(int i=0;i<a.trim().length();i++)
		{
			char myChar = a.trim().charAt(i);
			if(myChar == 'v')
			{
				count++; // count = count + 1;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
