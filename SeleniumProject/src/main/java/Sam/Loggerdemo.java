package Sam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Loggerdemo {

	private static Logger logger=LogManager.getLogger(Loggerdemo.class);
	public static void main(String[] args) {
		
		System.out.println("Hello");
		logger.trace("This is trace");
		logger.info("This is info");
		logger.error("This error");
		logger.warn("This is warn");
		logger.fatal("This is fatal");
		System.out.println("Completed");
	}

}
