package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program generate the multiplication table ask for the user
 *
 * @author Santiago Moreno
 * @version 27/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int table;
        do {
            table = getTable();
            generateTable(table);
        } while (table != 0);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------Multiplication Tables--------------------╣");
        System.out.println("║═════════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 27/04/2020                          ║");
        System.out.println("║═════════════════════════════════════════════════════════════║");
        System.out.println("║              Created by: Santiago Moreno                    ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the number of multiplication table entered for the user and valid it
     *
     * @return Integer that represent the number of multiplication table
     */
    public static int getTable() {
        int table;
        do {
            System.out.println("Enter the number of the multiplication table (this must be between 1 and 99):");
            System.out.println("If you want stop the process press 0: ");
            table = keyboard.nextInt();
        } while (table < 0 || table > 99);
        return table;
    }

    /**
     * This function generate the multiplication table ask for the user
     *
     * @param p_table Integer that represent the number of multiplication table
     */
    public static void generateTable(int p_table) {
        if (p_table == 0) {
            System.out.println("The process has finished, Thanks for you participation! ");
        } else {
            System.out.println("Multiplication table " + p_table + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(p_table + " * " + i + " = " + (p_table * i));
            }
        }
    }
}