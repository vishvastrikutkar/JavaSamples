package CoreJava;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    private static final String log4JPropertyFile = "Logging\\log4j.properties";

    public static Logger initializeLogger(Class c)
    {
        Logger logger;
        logger = Logger.getLogger(c);

        Properties p = new Properties();
        try {
            p.load(new FileInputStream(log4JPropertyFile));
            PropertyConfigurator.configure(p);
        }catch (IOException e)
        {
            logger.error(e.getMessage());
        }
        return logger;
    }
}
