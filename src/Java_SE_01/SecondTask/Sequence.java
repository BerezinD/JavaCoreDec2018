package Java_SE_01.SecondTask;

import com.sun.istack.internal.NotNull;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is writing to display a first member of sequence,
 * which smaller than ε and N-member is a = 1/(N+1)^2 and N > 0
 * @author BerezinD
 * @version 2.0
 * from <i>11.12.2013</i>
 */
public class Sequence {

    public static void main(String[] args) {
        double epsilon = 0.0;

        System.out.println("Welcome to SEQUENCE!!\n" +
                "To print all members of sequence a = 1/(n+1)^2\n" +
                "Note that any \u03b5 greater than 0.25 make result only with first a\n" +
                "and, if \u03b5 would be greater than 0 - answer is infinity\n" +
                "   just type an \u03b5 (all printed members will be above \u03b5):");

        Scanner userInput = new Scanner(System.in);

        /*
         * with while(true) we check that user input is correct
         * ε must be greater than zero and valid number
         */
        while (true){
            try {
                System.out.print("\u03b5 = ");
                epsilon = userInput.nextDouble();
                if (epsilon <= 0){
                    System.out.println("It's infinity, dude! Put in greater then 0, right?");
                    continue;
                }
                break;
            } catch (InputMismatchException ex){
                System.out.println("Please use numbers, dude!");
                userInput.nextLine();
            }
        }

        /*
         * than, we just call simple void function to print what they need =)
         */
        Sequence.printEpamSequence(epsilon);
    }

    /**
     * Simple as pice of cake - first member always would be 0.25
     * than we check that ε still smaller than next member of sequence
     * after all, we print a number N for user.
     * @param epsilon - not null and not NaN double that > a(n)
     */
    static private void printEpamSequence(@NotNull double epsilon){
        double member = 0.25;
        int n = 2; //counter
        do {
            System.out.println(member);
            member = 1.0/(n*n+2.0*n+1.0);
            n++;
        } while (member >= epsilon);
        System.out.println("And N = " + (n-2));
    }
}
