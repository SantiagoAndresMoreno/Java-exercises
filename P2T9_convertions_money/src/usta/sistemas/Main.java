package usta.sistemas;

import java.util.Scanner;

/**
 * This program performs the conversion between colombian pesos, dollars and euros
 *
 * @author Santiago Moreno
 * @version 16/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int option = option();
        if (option==1)
            pesos_to_dollars();
        else if (option==2)
            pesos_to_euros();
        else
            euros_to_dollars();
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------SoftConvertMoney-------------------╣");
        System.out.println("║══════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 16/04/2020                   ║");
        System.out.println("║══════════════════════════════════════════════════════║");
        System.out.println("║            Created by: Santiago Moreno               ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the option verifies it (1-3) and returns it
     *
     * @return integer that represent the chosen option
     */
    public static int option() {
        System.out.println("Enter the option to convert: ");
        System.out.println(" 1. Colombian pesos to Dollars \n 2. Colombian pesos to Euros \n 3. Euros to Dollars ");
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("Error: the option is out range!.\n Enter another option: ");
            System.out.println(" 1. Colombian pesos to Dollars \n 2. Colombian pesos to Euros \n 3. Euros to Dollars ");
            option = keyboard.nextInt();
        }
        return option;
    }

    /**
     * This function convert colombian pesos to dollars
     */
    public static void pesos_to_dollars() {
        System.out.println("Enter the amount colombian pesos: ");
        double pesos = keyboard.nextInt();
        while (pesos < 1000) {
            System.err.println("Error: The amount of Colombian pesos should be greater than 1000 ");
            System.out.println("Enter again the amount colombian pesos: ");
            pesos = keyboard.nextInt();
        }
        double dollars = pesos / 3977.06;
        System.out.println(pesos + " Colombian pesos are equal to " + dollars + " dollars");
    }

    /**
     * This function convert colombian pesos to euros
     */
    public static void pesos_to_euros() {
        System.out.println("Enter the amount colombian pesos: ");
        double pesos = keyboard.nextInt();
        while (pesos < 1000) {
            System.err.println("Error: The amount of Colombian pesos should be greater than 1000 ");
            System.out.println("Enter again the amount colombian pesos: ");
            pesos = keyboard.nextInt();
        }
        double euros = pesos / 4319.98;
        System.out.println(pesos + " Colombian pesos are equal to " + euros + " Euros");
    }

    /**
     * This function euros to dollars
     */
    public static void euros_to_dollars() {
        System.out.println("Enter the euros: ");
        double euros = keyboard.nextInt();
        while (euros < 10) {
            System.err.println("Error: The amount of Euros should be greater than 10 ");
            System.out.println("Enter again the amount Euros: ");
            euros = keyboard.nextInt();
        }
        double dollars = euros * 1.09;
        System.out.println(euros + " Euros are equal to " + dollars + " dollars");
    }
}