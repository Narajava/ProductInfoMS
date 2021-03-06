package com.tiagoamp.productcatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	
	@Value("${hello.msg}")
	private String hostName;
	
	  @Autowired
	  private Environment env;
	
	
	
	@GetMapping("/hello-msg")
	public String getMessage() {
		System.out.println("Reading property file");
		System.out.println("Hello Message :"+hostName);
		System.out.println(System.getenv("HOSTNAME"));
		System.out.println(env.getProperty("HOSTNAME"));
		System.out.println(env.getProperty("app.name"));
		System.out.println(env.getProperty("localhost"));
			
//		InputStream inputStream=null;
//		
//		InputStream inputStream1=null;
//		try {
//			Properties prop = new Properties();
//			String propFileName = "config/ESBFluentd.properties";
// 
//			inputStream = new FileInputStream(propFileName);   
// 
//			if (inputStream != null) {
//				prop.load(inputStream);
//			}
// 
//			Date time = new Date(System.currentTimeMillis());
// 
//			// get the property value and print it out
//			String environment = prop.getProperty("FluentdEnv");
//			String hostlist = prop.getProperty("FluentdHostList");
//            System.out.println("ENvironment :"+environment);
//            System.out.println("HOSTLIST :"+hostlist);
//            
//            Path currentRelativePath = Paths.get("");
//    		String s = currentRelativePath.toAbsolutePath().toString();
//    		System.out.println("Current absolute path is: " + s);
//    		
//    		 File directoryPath = new File(s);
//    	      //List of all files and directories
//    	      String contents[] = directoryPath.list();
//    	      System.out.println("List of files and directories in the specified directory:");
//    	      for(int i=0; i<contents.length; i++) {
//    	         System.out.println(contents[i]);
//    	      }
//    	      
//    	      
//    	    
//    	        	System.out.println("CLASS PATH"+System.getProperty("java.class.path"));
//            
//            
//            
//            
//            
//        	Properties prop1 = new Properties();
//			String propFileName1 = "config/ESBFluentd.properties";
// 
//			inputStream1 = new FileInputStream(propFileName1);
// 
//			if (inputStream1 != null) {
//				prop1.load(inputStream1);
//			}
// 
//		 
//			// get the property value and print it out
//			String environment1 = prop1.getProperty("ENV_NAME");
//			String hostlist1 = prop1.getProperty("HOST_NAME");
//            System.out.println("ENvironment :"+environment1);
//            System.out.println("HOSTLIST :"+hostlist1);
//            
//            
//            
//		} catch (Exception e) {
//			System.out.println("Exception: " + e);
//		} finally {
//			try {
//				if(inputStream !=null)
//				      inputStream.close();
//			} catch (IOException e) {
//				System.out.println("Exception: " + e);
//			}
//		}
//		
//		
		return "Welcome to Openshift";
		
	}

}
