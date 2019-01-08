package Java_SE_01.FirstTask.main;

import Java_SE_01.FirstTask.logic.Logic;

/**
 * Class that contains 1 runnable main method <b>{@link Main#main(String[])}</b>.
 * @author someOneFromEPAM
 * @version 2.0
 * from <i>11.12.2013</i>
 *
 * To compile this java file into *.class and run a whole program - just type in console (from <i>src</i> directory)
 * <b>javac -sourcepath Java_SE_01  Java_SE_01/FirstTask/main/Main.java</b>
 * After all, you need to run all this code
 * like this:
 * <b>java.exe Java_SE_01.FirstTask.main.Main</b>
 */
public class Main {

    /**
     * Call a {@link Logic#method()} to print build-in string
     * @param args - nothing to use
     */
    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.method());
    }
}