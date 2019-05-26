package testCases;

import org.apache.logging.log4j.*;

public class MainClass {

	private static Logger log = LogManager.getLogger(MainClass.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am debugging");
		log.info("Object is present");
		log.error("Object is not present");
		log.fatal("This is fatal");

	}

}
