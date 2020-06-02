package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This Program Generates Random Values ​​of USTA Student Scores for Food in the Giordano Bruno Building
 *
 * @author Santiago Moreno
 * @version 13/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int students = getStudents();
        int[][] scores = getMatrix(students);
        printMatrix(scores, students);
        classificationScore(scores, students);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Rating the food-------------------╣");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 13/05/2020                  ║");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno               ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    /**
     * This function get the number of students
     *
     * @return Integer that represents the students's number
     */
    public static int getStudents() {
        int studentsNumber;
        System.out.println("Enter the number of students ");
        do {
            System.out.println("The value can not negative! ");
            studentsNumber = keyboard.nextInt();
        } while (studentsNumber < 0);
        return studentsNumber;
    }

    /**
     * This function generate twenty random scores for n students
     *
     * @param p_students Integer that represent the students's number
     * @return Matrix that to save the students's scores
     */
    public static int[][] getMatrix(int p_students) {
        int[][] scores = new int[p_students][20];
        for (int i = 0; i < p_students; i++) {
            for (int j = 0; j < 20; j++) {
                scores[i][j] = (int) (Math.random() * (11 - 1) + 1);
            }
        }
        return scores;
    }

    /**
     * This function print the matrix
     *
     * @param p_matrix   Matrix that to save the students's scores
     * @param p_students Integer that represent the students's number
     */
    public static void printMatrix(int[][] p_matrix, int p_students) {
        for (int i = 0; i < p_students; i++) {
            System.out.println("The scores of the student for a month " + (i + 1) + " are:");
            for (int j = 0; j < 20; j++) {
                System.out.println("  Score " + (j + 1) + " is: " + p_matrix[i][j]);

            }
            System.out.println(" ");
        }
    }

    /**
     * This function calculate the number and percent of scores according with the qualification:
     *
     * @param p_matrix   Matrix that to save the students's scores
     * @param p_students Integer that represent the students's number
     */
    public static void classificationScore(int[][] p_matrix, int p_students) {
        float badFood = 0, regularFood = 0, excellentFood = 0;
        for (int i = 0; i < p_students; i++) {
            for (int j = 0; j < 20; j++) {
                if (p_matrix[i][j] <= 3) {
                    badFood++;
                } else if (p_matrix[i][j] <= 6) {
                    regularFood++;
                } else {
                    excellentFood++;
                }
            }
        }
        System.out.println(" ");
        System.out.println("The number of scores rated as bad food (score <= 3) is: " + badFood);
        System.out.println("whit a percent of: " + ((badFood * 100) / (20 * p_students)) + "%");

        System.out.println("The number of scores rated as regular (score between 4 and 6) food is: " + regularFood);
        System.out.println("whit a percent of: " + ((regularFood * 100) / (20 * p_students)) + "%");

        System.out.println("The number of scores rated as excellent (score >= 7) food is: " + excellentFood);
        System.out.println("whit a percent of: " + ((excellentFood * 100) / (20 * p_students)) + "%");
    }
}