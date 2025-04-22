package CoreJava.StringProblems;

import CoreJava.Utility;
import org.apache.log4j.Logger;

public class RemoveString {
    private static final Logger log = Utility.initializeLogger(RemoveString.class);
    public static void main(String[] args) {
        log.info(withoutString("Hello There","llo"));
        log.info(withoutString("Hello There","e"));
        log.info(withoutString("abxxxab", "xx"));
        log.info(withoutString("This IS FISH","IS"));
        log.info(withoutString("AA22bb", "2"));
        log.info(withoutString("MkjtMkx", "Mk"));
    }
    public static String withoutString(String str, String remStr) {
        return str.replaceAll("(?i)"+remStr,"");
    }


}
