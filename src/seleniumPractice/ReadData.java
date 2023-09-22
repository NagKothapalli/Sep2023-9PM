package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	
	public String readUserData(String key) throws IOException
	{
		FileInputStream myfile = new FileInputStream("D:\\WorkSpace\\Java\\Sep2023-9PM\\TestData\\MyTestData.properties");
		Properties prop = new Properties();
		prop.load(myfile);
		String value = prop.getProperty(key); // a=a1 , b=b1 , c=c1
		return value;
	}

}
