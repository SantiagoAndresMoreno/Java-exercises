package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program read 5 numbers and show them in reverse order to the one entered
 *
 * @author Santiago Moreno
 * @version 29/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int[] arrayNumbers = getNumbers();
        System.out.print("The reverse order of this numbers is: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arrayNumbers[i] + " ");
        }
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------Reverse Numbers--------------------╣");
        System.out.println("║═══════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 29/04/2020                    ║");
        System.out.println("║═══════════════════════════════════════════════════════║");
        System.out.println("║            Created by: Santiago Moreno                ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
    }

    /**
     * This function get the five numbers in a array and calculates the average of this numbers
     *
     * @return Array of the entered numbers
     */
    public static int[] getNumbers() {
        int number;
        int[] arrayNumbers = new int[5];
        double averageNumber, sumNumbers = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number " + (i + 1) + ": ");
            number = keyboard.nextInt();
            arrayNumbers[i] = number;
            sumNumbers += number;
        }
        averageNumber = sumNumbers / 5;
        System.out.println("The average of this numbers is: " + averageNumber);
        System.out.println("------------------------------------------------");
        return arrayNumbers;
    }
}