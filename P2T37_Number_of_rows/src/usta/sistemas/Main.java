package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program generates random numbers between 1 and 1000 in a matrix of N x M (values that are entered
 * by the keyboard) and calculates the average, the sum and the greater number of the row that the user enters.
 *
 * @author Santiago Moreno
 * @version 14/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int[] rowsColumns = getRowsColumns();
        int[][] matrix = getMatrix(rowsColumns);
        printMatrix(matrix);
        int rowNumber = getRowNumber(rowsColumns);
        matrixCalculations(matrix, rowNumber);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Numbers of Rows-------------------╣");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 14/05/2020                  ║");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║          Created by: Santiago Moreno                ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    /**
     * This function asks for the number of rows and columns of the matrix
     *
     * @return Array that contains the rows and columns number
     */
    public static int[] getRowsColumns() {
        int rows, columns;
        int[] rowsColumns = new int[2];
        System.out.println("To create the matrix you need to specify the rows and column number \n ");
        do {
            System.out.println("Enter the rows number (the value can not negative!): ");
            rows = keyboard.nextInt();
        } while (rows < 0);
        do {
            System.out.println("Enter the columns number (the value can not negative!): ");
            columns = keyboard.nextInt();
        } while (columns < 0);
        rowsColumns[0] = rows;
        rowsColumns[1] = columns;
        return rowsColumns;
    }

    /**
     * This function gets the row number to calculate its sum, average and major number
     *
     * @param p_rowsColumns Array that contains the rows and columns number
     * @return Integer that represent the row number
     */
    public static int getRowNumber(int[] p_rowsColumns) {
        System.out.println("Enter the rows that yo want calculate its sum, average and major number: ");
        int rowNumber = keyboard.nextInt();
        while (rowNumber <= 0 || rowNumber > p_rowsColumns[0]) {
            System.err.println("This value is out in the established range! ");
            rowNumber = keyboard.nextInt();
        }
        return (rowNumber - 1);
    }

    /**
     * This function fills the array with random numbers according to the number of rows and columns entered
     *
     * @param p_rowsColumns Array that contains the rows and columns number
     * @return Matrix that saves the random numbers
     */
    public static int[][] getMatrix(int[] p_rowsColumns) {
        int[][] matrix = new int[p_rowsColumns[0]][p_rowsColumns[1]];
        for (int i = 0; i < p_rowsColumns[0]; i++) {
            for (int j = 0; j < p_rowsColumns[1]; j++) {
                matrix[i][j] = (int) Math.floor(Math.random() * (1000) + 1);
            }
        }
        return matrix;
    }

    /**
     * This function prints the matrix
     *
     * @param p_matrix Matrix that saves the random numbers
     */
    public static void printMatrix(int[][] p_matrix) {
        System.out.println(" ");
        for (int[] pMatrix : p_matrix) {
            System.out.print("{");
            for (int matrix : pMatrix) {
                System.out.print(" " + matrix + " ");
            }
            System.out.print("}");
            System.out.println(" \n");
        }
    }

    /**
     * This function calculates the average, the sum and the greater number of the row that the user enters
     *
     * @param p_matrix Matrix that saves the random numbers
     * @param p_row    Integer that represent the row number
     */
    public static void matrixCalculations(int[][] p_matrix, int p_row) {
        double sum = 0, average;
        int greaterNumber = 0;
        for (int i = 0; i < p_matrix[p_row].length; i++) {
            if (i == 0) {
                greaterNumber = p_matrix[p_row][i];
            } else if (p_matrix[p_row][i] > greaterNumber) {
                greaterNumber = p_matrix[p_row][i];
            }
            sum += p_matrix[p_row][i];
        }
        average = sum / p_matrix[p_row].length;
        System.out.println("The sum of the row " + (p_row + 1) + " is: " + sum);
        System.out.println("   its average is: " + average);
        System.out.println("   its greater number is: " + greaterNumber);
    }
}