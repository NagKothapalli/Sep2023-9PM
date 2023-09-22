package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesUtility
{
	String filepath; //null
	public ReadPropertiesUtility(String filepath) //abcd
	{
		this.filepath = filepath;
	}
	public String getData(String key) throws IOException
	{
		FileInputStream myfile = new FileInputStream(filepath); //null
		Properties prop = new Properties();
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
	}

}
