package usta.sistemas;

import java.util.Scanner;

/**
 * This software realize the conversion between kilometers, mills and yards
 *
 * @author Santiago Moreno
 * @version 16/03/2020
 */

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int opt = option();
        if (opt == 1)
            kilometers_to_mills();
        else if (opt == 2)
            kilometers_to_yards();
        else if (opt == 3)
            mills_to_kilometers();
        else
            yards_to_kilometers();
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftConvert--------------------╣");
        System.out.println("║═══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 15/04/2020                ║");
        System.out.println("║═══════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno             ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    /**
     * This function return the chosen option to convert
     *
     * @return integer that represent the chosen option
     */
    public static int option() {
        System.out.println("Enter the option to convert: ");
        System.out.println(" 1. Kilometers to Mill \n 2. Kilometers to yards \n 3. Mill to Kilometers \n 4. Yards to kilometers ");
        int option = keyboard.nextInt();
        while (option < 1 || option > 4) {
            System.out.println("Enter another option to convert: ");
            System.out.println(" 1. Kilometers to Mill \n 2. Kilometers to yards \n 3. Mill to Kilometers \n 4. Yards to kilometers");
            option = keyboard.nextInt();
        }
        return option;
    }

    /**
     * This function convert kilometers to mills
     */
    public static void kilometers_to_mills() {
        System.out.println("Enter the number of kilometers to convert: ");
        double kilometers, mills;
        kilometers = keyboard.nextInt();
        mills = kilometers / 1.609;
        System.out.println("The number of mills in " + kilometers + " kilometers are " + mills);
    }

    /**
     * This function convert kilometers to yards
     */
    public static void kilometers_to_yards() {
        System.out.println("Enter the number of kilometers to convert: ");
        double kilometers, yards;
        kilometers = keyboard.nextInt();
        yards = kilometers * 1093.61;
        System.out.println("The number of yards in " + kilometers + " kilometers are " + yards);
    }

    /**
     * This function convert mills to kilometers
     */
    public static void mills_to_kilometers() {
        System.out.println("Enter the number of mills to convert: ");
        double kilometers, mills;
        mills = keyboard.nextInt();
        kilometers = mills * 1.60934;
        System.out.println("The number of kilometers in " + mills + " mills are " + kilometers);
    }

    /**
     * This function convert yards to kilometers
     */
    public static void yards_to_kilometers() {
        System.out.println("Enter the number of yards to convert: ");
        double kilometers, yards;
        yards = keyboard.nextInt();
        kilometers = yards / 1093.61;
        System.out.println("The number of kilometers in " + yards + " yards are " + kilometers);
    }
}