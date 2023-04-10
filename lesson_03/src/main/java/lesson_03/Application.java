package lesson_03;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {
	public static Logger LOG = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		
		//logBasicConfigurator();
		logDOMConfigurator();
		
		
		
	}
	
	public static void logBasicConfigurator() {
		BasicConfigurator.configure();
		
		LOG.trace("TRACE message");
		LOG.debug("DEBUG message");
		LOG.info("INFO message");
		LOG.warn("WARN message");
		LOG.error("ERROR message");
		LOG.fatal("FATAL message");
	}
	
	public static void logDOMConfigurator() {
		DOMConfigurator.configure("loggerConfig.xml");
		
		LOG.trace("TRACE message");
		LOG.debug("DEBUG message");
		LOG.info("INFO message");
		LOG.warn("WARN message");
		LOG.error("ERROR message");
		LOG.fatal("FATAL message");
	}
}
