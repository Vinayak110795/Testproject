package New;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream inStream=new FileInputStream("C:\\Users\\Sharp\\git\\Testproject\\CurrentDri\\login.properties");
		 
		Properties properties=new Properties();
		properties.load(inStream);
		System.out.println(properties.getProperty("username"));
	}
	
}
