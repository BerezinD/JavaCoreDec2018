package Java_SE_01.ThirdTask;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * This class is writing to solve only one task - homework from EPAM
 * @author BerezinD
 * @version 2.0
 * from <i>11.12.2013</i>
 */
public class FindNumber {

    /**
     * This main method for run program
     * And - with user input
     * @param args - nothing to use
     */
    public static void main(String[] args) {
        double start, end, step;
        start = 0.0; end = 0.0; step = 0.0;

        System.out.println("Welcome to calculator F(x)!\n" +
                "To calculate simple function F(x) = tg(2x)-3 inside specific interval\n" +
                "type next arguments in a correct order:\n" +
                "Start of interval (enter), End of interval (enter), Step of calculations (enter).");

        Scanner userInput = new Scanner(System.in);
        while (true){
            try {
                System.out.print("start = ");
                start = userInput.nextDouble();
                System.out.print("end = ");
                end = userInput.nextDouble();
                System.out.print("step = ");
                step = userInput.nextDouble();
                break;
            } catch (InputMismatchException ex){
                System.out.println("Please use numbers, dude!");
                userInput.nextLine();
            }

        }
        FindNumber.printTable(FindNumber.function(start,end,step));
    }

    /**
     * Just for print table
     * @param array - for print one table with two columns
     *              and in one representation - double numbers
     *              with 4 digits after point. Works correct in +-10 000 000 not inclusive.
     */
    private static void printTable(double[][] array){
        System.out.println("\u250C-------------\u252C-------------\u2510");
        System.out.println("\u2502      x      \u2502     F(x)    \u2502");
        System.out.println("\u251C-------------\u253C-------------\u2524");
        for (double[] argument : array) {
            System.out.print("\u2502");

            for (double result : argument) {
                System.out.printf("%10.4f%4s", result, "\u2502");
            }

            System.out.println(); //add new line
        }
        System.out.print  ("\u2514-------------\u2534-------------\u2518");
    }

    /**
     * Calculate function tg(2x)-3
     * @param start of interval, inclusive
     * @param end of interval, inclusive
     * @param step of calculating function
     * @return table (array of doubles) ready for print
     */
    private static double[][] function(double start, double end, double step){
        if (end < start) return  function(end,start,step);
        if (step == 0.0) return new double[][] {{start,Math.tan(2.0*start)-3.0}};

        final int amount = (int)((end - start)/step)+1;
        int counter = 0;
        double argument = start;
        double[][] result = new double[amount][2];

        while (argument <= end){
            result[counter][0] = argument;
            result[counter][1] = Math.tan(2.0*argument)-3.0;
            counter++;
            argument += step;
        }
        return result;
    }
}
