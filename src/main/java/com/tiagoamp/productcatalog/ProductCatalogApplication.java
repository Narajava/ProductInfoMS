package com.tiagoamp.productcatalog;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource({ "classpath:/${CONFIG_LOCATION}/ESBFluentd.properties", "classpath:application.yml" })
@SpringBootApplication
public class ProductCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(Environment environment) {
		return args -> {
			
			/*
			 * System.out.println("NARA RUNNNING DURING STARTUP");
			 * System.out.println("NARA RUNNNING DURING STARTUP");
			 * System.out.println("NARA RUNNNING DURING STARTUP");
			 * System.out.println("NARA RUNNNING DURING STARTUP"); InputStream inputStream =
			 * null; try { Properties prop = new Properties(); String propFileName =
			 * "ESBFluentd.properties";
			 * 
			 * inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			 * 
			 * if (inputStream != null) { prop.load(inputStream); } else { throw new
			 * FileNotFoundException("property file '" + propFileName +
			 * "' not found in the classpath"); }
			 * 
			 * FileOutputStream out = new FileOutputStream("ESBFluentd.properties");
			 * prop.setProperty("FluentdEnv", "DEV"); prop.setProperty("FluentdHostList",
			 * "LOCALHOST"); prop.store(out, null); out.close();
			 * 
			 * 
			 * 
			 * } catch (Exception e) { System.out.println("Exception: " + e); } finally {
			 * try { if (inputStream != null) inputStream.close(); } catch (IOException e) {
			 * System.out.println("Exception: " + e); } }
			 */

		};
	}
}
