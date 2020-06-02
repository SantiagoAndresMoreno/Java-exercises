package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program ask for a password (3 attempts maximum) or until the password is 352, 259 or 569
 *
 * @author Santiago Moreno
 * @version 23/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        boolean password = askPassword();
        int counter = 1;
        while (!password && counter < 3) {
            System.err.println("The password is wrong!");
            password = askPassword();
            counter++;
        }

        if (!password) {
            System.err.println("Error: you have exceeded the number of attempts");
        } else {
            System.out.println("Congratulations! You have sign in...");
        }
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftPassword--------------------╣");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 23/04/2020                 ║");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║          Created by: Santiago Moreno               ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    /**
     * This function checks the password entered
     *
     * @return Boolean that represent if the password is correct
     */
    public static boolean askPassword() {
        System.out.println("Enter the password: ");
        int password = keyboard.nextInt();
        boolean sooth;
        sooth = password == 352 || password == 259 || password == 569;
        return sooth;
    }
}