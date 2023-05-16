package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
 

public class BasicConfiguratorExample {

	
    static Logger logger = Logger.getLogger(BasicConfigurator.class);
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
		logger.debug("This is a debug message");
		logger.info("This is information message");
		logger.warn("This is warning messgae");
		logger.error("This is an wrror");
		logger.fatal("This is fatal message");
	}

}
