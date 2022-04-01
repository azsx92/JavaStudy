package ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class EX11_38 {
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// prop에 키와 값(key, value)을 저장한다.
		prop.setProperty("timeout" , "30");
		prop.setProperty("languge" , "kr");
		prop.setProperty("size"    , "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

} // end of class 

