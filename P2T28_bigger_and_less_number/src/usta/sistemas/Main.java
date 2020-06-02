package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This function asks for numbers by keyboard, stores them in an array list and calculates the greatest and
 * smallest number
 *
 * @author Santiago Moreno
 * @version 05/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int totalNumbers = getTotalNumbers();
        less_Bigger_number(getNumbers(totalNumbers), totalNumbers);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("╠---------------Bigger and less Number---------------╣");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 05/05/2020                 ║");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno              ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    /**
     * This function asks the total numbers and validates it (the value can not negative)
     *
     * @return Integer that represent the total numbers
     */
    public static int getTotalNumbers() {
        System.out.println("Enter the total numbers to enter: ");
        int totalNumbers = keyboard.nextInt();
        while (totalNumbers < 0) {
            System.err.println("The total numbers can not be negative! ");
            System.out.println("Enter another value: ");
            totalNumbers = keyboard.nextInt();
        }
        return totalNumbers;
    }

    /**
     * This function gets the numbers and save in a array list
     *
     * @param p_totalNumbers Integer that represent the entered total numbers
     * @return Array of numbers
     */
    public static int[] getNumbers(int p_totalNumbers) {
        int[] arrayNumbers = new int[p_totalNumbers];
        for (int i = 0; i < p_totalNumbers; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
            arrayNumbers[i] = keyboard.nextInt();
        }
        return arrayNumbers;
    }

    /**
     * This function calculates the less and the greatest number
     *
     * @param p_arrayNumber Array that represent the list of numbers
     * @param p_limit Integer that represent the limit of array list
     */
    public static void less_Bigger_number(int[] p_arrayNumber, int p_limit) {
        int greatestNumber = 0, lessNumber = 0;
        for (int i = 0; i < p_limit; i++) {
            if (i == 0) {
                greatestNumber = p_arrayNumber[i];
            } else if (greatestNumber < p_arrayNumber[i]) {
                greatestNumber = p_arrayNumber[i];
            }
            if (i == 0) {
                lessNumber = p_arrayNumber[i];
            } else if (lessNumber > p_arrayNumber[i]) {
                lessNumber = p_arrayNumber[i];
            }
        }
        System.out.println("The greatest number is: " + greatestNumber);
        System.out.println("The less number is: " + lessNumber);
    }

}