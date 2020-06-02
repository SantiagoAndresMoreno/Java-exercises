package usta.sistemas;

/**
 * Description: This program with the information entered (saved in a Matrix) replaces all the vowels with a = @, e = 3,
 * i = 1, o = Ø (alt + 157), u = ⌂ (alt +127) and Converts all words to uppercase.
 *
 * @author Santiago Moreno
 * @version 14/05/2020
 */
public class Main {

    public static void main(String[] args) {
        menu();
        String[][] names =
                {{"maria", "pedro", "JOSE", "Camilo", "rodrigo"},
                        {"Ana", "Lucia", "Martha", "Juliana", "Patricia"},
                        {"Felipe", "ALEXANDER", "Soffy", "Carmen", "Augusto"},
                        {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}
                };
        printMatrix(replaceVowels(names));
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Convert Words-------------------╣");
        System.out.println("║═══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 14/05/2020                ║");
        System.out.println("║═══════════════════════════════════════════════════║");
        System.out.println("║         Created by: Santiago Moreno               ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    /**
     * This function replaces the vowels in each name in the matrix with: a = @, e = 3, i = 1, o = Ø (alt + 157),
     * u = ⌂ (alt +127)
     *
     * @param p_matrix Matrix that contains the names
     * @return Matrix converted
     */
    public static String[][] replaceVowels(String[][] p_matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                p_matrix[i][j] = p_matrix[i][j].toUpperCase();
                p_matrix[i][j] = p_matrix[i][j].replace("A", "@").replace("E", "3").
                        replace("I", "1").replace("O", "Ø").replace("U", "⌂");
            }
        }
        return p_matrix;
    }

    /**
     * This function print the matrix
     *
     * @param p_matrix Matrix that contains the names
     */
    public static void printMatrix(String[][] p_matrix) {
        for (String[] pMatrix : p_matrix) {
            System.out.print("{");
            for (String matrix : pMatrix) {
                System.out.print(" " + matrix + " ");
            }
            System.out.print("}");
            System.out.println("\n");
        }
    }
}