package Java_SE_01.SecondTask;

import com.sun.istack.internal.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        double epsilon = 0.0;

        System.out.println("Welcome to SEQUENCE!!\n" +
                "To print all members of sequence a = 1/(n+1)^2\n" +
                "Note that any \u03b5 greater than 0.25 make result only with first a\n" +
                "   just type an \u03b5 (all printed members will be above \u03b5):");

        Scanner userInput = new Scanner(System.in);
        while (true){
            try {
                System.out.print("\u03b5 = ");
                epsilon = userInput.nextDouble();
                break;
            } catch (InputMismatchException ex){
                System.out.println("Please use numbers, dude!");
                userInput.nextLine();
            }
        }
        Sequence.printEpamSequence(epsilon);
    }

    static private void printEpamSequence(@NotNull double epsilon){
        double member = 0.25;
        int n = 0; //counter
        do {
            System.out.println(member);
            member = 1.0/(n*n+2.0*n+1.0);
            n++;
        } while (member > epsilon);
    }
}
