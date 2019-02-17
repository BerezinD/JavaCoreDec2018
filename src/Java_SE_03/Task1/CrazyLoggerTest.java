package Java_SE_03.Task1;

import org.junit.jupiter.api.Test;

class CrazyLoggerTest {

    @Test
    void findLog() {
        CrazyLogger.putInLog("wwww");
        CrazyLogger.putInLog("aaaa");
        CrazyLogger.putInLog("ddddggg");
        CrazyLogger.putInLog("dddd");
        CrazyLogger.putInLog("wwaaw");
        CrazyLogger.findLog("dddd", System.out);
        CrazyLogger.findLog(17, 2, 2019, System.out);
    }

    @Test
    void putInLog() {
        CrazyLogger.putInLog("wwww");
        CrazyLogger.putInLog("aaaa");
        CrazyLogger.putInLog("ddddggg");
        CrazyLogger.putInLog("dddd");
        CrazyLogger.putInLog("wwaaw");
    }
}