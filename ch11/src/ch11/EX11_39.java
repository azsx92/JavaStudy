package ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class EX11_39 {
	
	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		
		System.out.println("java.version :" + sysProp.getProperty("java.version"));
		System.out.println("java.language :" + sysProp.getProperty("java.language"));
		
		sysProp.list(System.out);

	}

} // end of class 

