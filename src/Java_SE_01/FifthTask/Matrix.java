package Java_SE_01.FifthTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n;
        while (true){
            try {
                System.out.print("Type size of square matrix N = ");
                n = userInput.nextInt();
                if (n <= 0){
                    System.out.println("It's size, dude! Put in greater then 0, right?");
                    continue;
                }
                break;
            } catch (InputMismatchException ex){
                System.out.println("Please use numbers, dude!");
                userInput.nextLine();
            }
        }

        printMatrix(createMatrixN(n));
    }

    private static void printMatrix(int[][] matrix){
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static int[][] createMatrixN(int dimension){
        int[][] result = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            result[i][i] = 1;
            result[i][dimension-i-1] = 1;
            result[dimension-i-1][i] = 1;
            result[dimension-i-1][dimension-i-1] = 1;
        }
        return result;
    }
}
