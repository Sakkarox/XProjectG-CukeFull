package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	
	private final static Properties prop;
	private static FileInputStream fis;
	
	static {
		prop = new Properties();
		try {
			fis = new FileInputStream("./src/main/resources/data/data.properties");
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String get(String property) {
		return prop.getProperty(property);
	}

}
