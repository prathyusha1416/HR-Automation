package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr =  new FileReader("C:\\Users\\202162\\eclipse-workspace\\SampleFramework\\src\\test\\resources\\ConfigFiles\\Config.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
		
	}

}
