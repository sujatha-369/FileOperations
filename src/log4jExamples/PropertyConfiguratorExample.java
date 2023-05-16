package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguratorExample {
	
	static Logger logg = Logger.getLogger(PropertyConfiguratorExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		PropertyConfigurator.configure("log4j.properties");
		logg.debug("This is a debug message");
		logg.info("This is information message");
		logg.warn("This is warning messgae");
		logg.error("This is an wrror");
		logg.fatal("This is fatal message"); 	 	
	}

}
