package usta.sistemas;

/**
 * Description: This program generates a multidimensional array with the four grades of ten students
 *
 * @author Santiago Moreno
 * @version 12/05/2020
 */
public class Main {

    public static void main(String[] args) {
        menu();
        float[][] gradesStudents = getMatrix();
        printMatrix(gradesStudents);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Students Grades-------------------╣");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 12/05/2020                  ║");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno               ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    /**
     * This function generates the matrix (10*4) of students grade's
     *
     * @return Matrix that contains the students grade's
     */
    public static float[][] getMatrix() {
        float[][] gradesStudents = new float[10][4];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                gradesStudents[i][j] = (float) (Math.random() * (5-1)+1);
            }
        }
        return gradesStudents;
    }

    /**
     * This function prints the matrix of the grades students and the final note
     *
     * @param p_matrix Matrix of the student's grades
     */
    public static void printMatrix(float[][] p_matrix) {
        for (int i = 0; i < 10; i++) {
            double finalNote = 0;
            System.out.println("The grades of the student " + (i + 1) + " are:");
            for (int j = 0; j < 4; j++) {
                System.out.println("grade " + (j + 1) + " is: " + p_matrix[i][j]);
                finalNote += p_matrix[i][j];
            }
            System.out.println("The final note of the student " + (i + 1) + " is: " + (finalNote / 4));
            System.out.println(" ");
        }
    }
}