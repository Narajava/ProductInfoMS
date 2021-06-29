package com.tiagoamp.productcatalog;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/hello-msg")
	public String getMessage() {
		System.out.println("Reading property file");
			
		InputStream inputStream=null;
		try {
			Properties prop = new Properties();
			String propFileName = "ESBFluentd.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			String environment = prop.getProperty("FluentdEnv");
			String hostlist = prop.getProperty("FluentdHostList");
            System.out.println("ENvironment :"+environment);
            System.out.println("HOSTLIST :"+hostlist);
            
            
        	Properties prop1 = new Properties();
			String propFileName1 = "./cmdirectory/appconfig.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName1);
 
			if (inputStream != null) {
				prop1.load(inputStream);
			} else {
				System.out.println("File Not Found");
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
		 
			// get the property value and print it out
			String environment1 = prop1.getProperty("ENV_NAME");
			String hostlist1 = prop1.getProperty("HOST_NAME");
            System.out.println("ENvironment :"+environment1);
            System.out.println("HOSTLIST :"+hostlist1);
            
            
            
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			try {
				if(inputStream !=null)
				      inputStream.close();
			} catch (IOException e) {
				System.out.println("Exception: " + e);
			}
		}
		
		
		return "Welcome to Openshift";
		
	}

}
