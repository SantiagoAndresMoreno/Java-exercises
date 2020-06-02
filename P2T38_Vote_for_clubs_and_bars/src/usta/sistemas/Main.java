package usta.sistemas;

/**
 * Description: This program simulates the approval of a bill in which its citizens vote Si or No for the approval
 * of clubs and bars, there are 123 municipalities and the number of votes are random
 *
 * @author Santiago Moreno
 * @version 15/05/2020
 */
public class Main {
    public static int[][] matrix = new int[124][2];

    public static void main(String[] args) {
        menu();
        getMatrix();
        printMatrix();
        calculationsMatrix();
        greaterVotesRow();
        lessVotesRow();
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("╠------------------SoftSmartpeople-------------------╣");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 26/05/2020                 ║");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno              ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    /**
     * This function generate the matrix with a random number of votes for each row
     */
    public static void getMatrix() {
        for (int i = 0; i < 123; i++) {
            matrix[i][0] = (int) Math.floor(Math.random() * (1000) + 1);
            matrix[i][1] = (int) Math.floor(Math.random() * (1000) + 1);
        }
        matrix[123][0] = 0;
        matrix[123][1] = 0;
    }

    /**
     * This function prints the matrix
     */
    public static void printMatrix() {
        System.out.println(" ");
        for (int i = 0; i < 123; i++) {
            System.out.print("municipality " + (i + 1) + " = {");
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("}");
            System.out.println(" \n");
        }
    }

    /**
     * This function determines the winner option, the sum and the average of each option
     */
    public static void calculationsMatrix() {
        float counterFavor = 0, counterAgainst = 0, averageFavor, averageAgainst;
        for (int i = 0; i < 123; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    counterFavor += matrix[i][j];
                } else {
                    counterAgainst += matrix[i][j];
                }
            }
        }
        averageFavor = (counterFavor * 100) / (counterFavor + counterAgainst);
        averageAgainst = (counterAgainst * 100) / (counterFavor + counterAgainst);
        if (averageFavor == averageAgainst) {
            System.out.println("Ups! there is not a winner ");
        } else if (averageFavor > averageAgainst) {
            System.out.println("The winner is the votes in favor with a percentage of: " + averageFavor + " \n ");
            matrix[123][0] = 0;
        } else {
            System.out.println("The winner is the votes in against with a percentage of: " + averageAgainst + " \n ");
            matrix[123][0] = 1;
        }
    }

    /**
     * This function determines the number municipality that voted most for the winner option
     */
    public static void greaterVotesRow() {
        int greaterNumber = 0, row = 0, winner = matrix[123][0];
        for (int i = 0; i < 123; i++) {
            if (i == 0) {
                greaterNumber = matrix[i][winner];
                row = i;
            } else if (greaterNumber < matrix[i][winner]) {
                greaterNumber = matrix[i][winner];
                row = i;
            }
        }
        System.out.println("The municipality that voted the most for the winner was the municipality number: " + (1 + row));
        System.out.println(" with a number of " + greaterNumber + " votes");
    }

    /**
     * This function determines the number municipality that voted less for the loser option
     */
    public static void lessVotesRow() {
        int lessNumber = 0, row = 0, loser = 2;
        if (matrix[123][0] == 1) {
            loser = 0;
        } else if (matrix[123][0] == 0) {
            loser = 1;
        }
        for (int i = 0; i < 123; i++) {
            if (i == 0) {
                lessNumber = matrix[i][loser];
                row = i;
            } else if (lessNumber > matrix[i][loser]) {
                lessNumber = matrix[i][loser];
                row = i;
            }
        }
        System.out.println("The municipality that voted less for the loser was the number municipality: " + (1 + row));
        System.out.println(" with a number of " + lessNumber + " votes");
    }
}