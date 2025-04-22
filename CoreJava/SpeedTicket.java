package CoreJava;

import org.apache.log4j.Logger;

public class SpeedTicket {
    private static final Logger log = Utility.initializeLogger(ShareDigitProblem.class);
    public static void main(String[] args) {
        SpeedTicket speedTicket = new SpeedTicket();
        log.info("Ticket : " + speedTicket.caughtSpeeding(60, false));
        log.info("Ticket : " + speedTicket.caughtSpeeding(65, false));
        log.info("Ticket : " + speedTicket.caughtSpeeding(85, true));
        log.info("Ticket : " + speedTicket.caughtSpeeding(75, true));
        log.info("Ticket : " + speedTicket.caughtSpeeding(90, true));
        log.info("Ticket : " + speedTicket.caughtSpeeding(90, false));
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else
                return 2;
        } else {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else
                return 2;
        }
    }
}
