package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program calculates the quantity of prime numbers in a entered range
 *
 * @author Santiago Moreno
 * @version 29/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int number = getNumber();
        System.out.println("The total of prime numbers in the established range is: " + quantityPrimes(number));
    }

    /**
     * This function gets and valid the entered number
     *
     * @return Integer that represent the entered number
     */
    public static int getNumber() {
        System.out.println("Enter the finish of range (1 - number): ");
        int number = keyboard.nextInt();
        while (number <= 0) {
            System.err.println("Error: The number must be not less than 0");
            System.out.println("Enter another number: ");
            number = keyboard.nextInt();
        }
        return number;
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------Prime Numbers--------------------╣");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 29/04/2020                  ║");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║              Created by:Santiago Moreno             ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the quantity of prime numbers in range of 1 and entered number
     *
     * @param p_number Integer that represents the final of range
     */
    public static int quantityPrimes(int p_number) {
        int counterP = 0;
        for (int i = 1; i <= p_number; i++) {
            int counterD = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    counterD += 1;
                }
            }
            if (counterD == 1) {
                System.out.println("The number " + i + " is a prime number ");
                counterP += 1;
            }
        }
        return counterP;
    }
}