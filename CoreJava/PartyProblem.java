package CoreJava;

import org.apache.log4j.Logger;

public class PartyProblem {
    private static final Logger log = Utility.initializeLogger(PartyProblem.class);
    public static void main(String[] args) {

        log.info(teaParty(6,8));
        log.info(teaParty(3,8));
        log.info(teaParty(20,6));
        log.info(teaParty(12,6));
        log.info(teaParty(11,6));
        log.info(teaParty(5,10));
        log.info(teaParty(10,20));
    }

    public static int teaParty(int tea, int candy) {
        if(!(tea<5 || candy<5))
        {
            if((tea>=2*candy) || (candy>=2*tea))
            {
                return 2;
            }else if(tea+candy>=5)
            {
                return 1;
            }

        }
        return 0;

    }
}
