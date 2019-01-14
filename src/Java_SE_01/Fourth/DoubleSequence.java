package Java_SE_01.Fourth;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleSequence {

    public static void main(String[] args) {
        double[] seq;
        int length;
        Scanner userInput = new Scanner(System.in);

        while (true){
            try {
                System.out.print("type length of array:\nn = ");
                length = userInput.nextInt();
                if (length <= 0){
                    System.out.println("Want to program works correctly? Type length above ZERO!");
                    continue;
                }
                seq = new double[length];
                System.out.println("Then print all numbers to fill array:");
                for (int i = 0; i < length; i++){
                    seq[i] = userInput.nextDouble();
                }
                break;
            } catch (InputMismatchException ex){
                System.out.println("Please use numbers, dude!\nOnes again!");
                userInput.nextLine();
            }
        }
        System.out.println(findMaxFromSequence(seq));
    }

    private static double findMaxFromSequence(@NotNull double[] array){
        int len = array.length;
        double[] temp = new double[len];
        for (int i = 0; i < len; i++) {
            temp[i] = array[i] + array[len-1-i];
        }
        Arrays.sort(temp);
        return temp[len-1];
    }
}
