package CoreJava;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggingExample {
    private static final Logger log = Utility.initializeLogger(LoggingExample.class);
    public static void main(String[] args) {

        log.info("This is information");
        log.error("This is error");
        log.debug("This is debug");
        log.trace("This is trace");
        log.fatal("This is fatal");
        log.warn("This is warning");

        Logger logger = LogManager.getRootLogger();

        logger.info("This is information");
        logger.error("This is error");
        logger.debug("This is debug");
        logger.trace("This is trace");
        logger.fatal("This is fatal");
        logger.warn("This is warning");
    }

}
