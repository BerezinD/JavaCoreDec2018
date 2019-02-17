package Java_SE_03.Task1;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* I use only StringBuilder to store log, so
   it's very big, slowly and heavy class. Yeah, it's really crazy))
 */
public class CrazyLogger {

    public final static String STR_FORMAT_DATE = "dd:MM:YYYY : hh-mm";
    private static StringBuilder log = new StringBuilder();

    public static void findLog(String message, OutputStream output) {
        int firstIn = log.indexOf(message);
        while (firstIn >= 0) {
            try {
                output.write(getMessageFromStringBuilder(log, firstIn).getBytes());
                output.write('\n');
            } catch (IOException e) {
                e.printStackTrace();
            }
            firstIn = log.indexOf(message, firstIn + 1);
        }
    }

    public static void findLog(int day, int month, int year, OutputStream output) {
        String message = String.format("%02d:%02d:%4d :", day, month, year);
        findLog(message, output);
    }

    private static String getMessageFromStringBuilder(StringBuilder target, int includingPosition) {
        if (target == null) return "";
        StringBuilder oneLine = new StringBuilder();
        boolean targetLine = false;
        for (int i = 0; i < target.length(); i++) {
            char currentChar = target.charAt(i);

            if (i == includingPosition) targetLine = true;

            if (currentChar == '\n') {
                if (targetLine) {
                    return oneLine.toString();
                } else {
                    oneLine = new StringBuilder();
                    continue;
                }
            }
            oneLine.append(currentChar);
        }

        return String.valueOf(oneLine);
    }

    public static void putInLog(String message) {
        DateFormat dateFormat = new SimpleDateFormat(STR_FORMAT_DATE);
        String format = dateFormat.format(new Date());
        log.append(format);
        log.append(" - ");
        log.append(message);
        log.append("\n");
    }
}
