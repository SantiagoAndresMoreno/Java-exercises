package usta.sistemas;

import java.util.Scanner;

/**
 * Description:This program determinate how many numbers are even or odd .
 *
 * @author Santiago Moreno
 * @version 07/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int limit = getLimit();
        int[] arrayNumbers = getArray(limit);
        classificationNumbers(arrayNumbers,limit);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Numbers Even or Odd-------------------╣");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 07/05/2020                      ║");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║              Created by: Santiago Moreno                ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the quantity of number to calculate
     *
     * @return Integer that represent the quantity of numbers
     */
    public static int getLimit() {
        System.out.println("Enter the quantity of number that you want input ");
        int limit;
        do {
            System.out.println("The value can not negative: ");
            limit = keyboard.nextInt();
        } while (limit < 0);
        return limit;
    }

    /**
     * This function get the numbers entered by keyboard and saves them in an Array
     *
     * @param p_limit Integer that represent the limit of Array
     * @return Array that saves the numbers
     */
    public static int[] getArray(int p_limit) {
        int[] numbers = new int[p_limit];
        for (int i = 0; i < p_limit; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
            numbers[i] = keyboard.nextInt();
        }
        return numbers;
    }

    /**
     * This function calculates how many numbers are even or odd
     *
     * @param p_arrayNumbers Array that saves the numbers
     * @param p_limit        Integer that represent the limit of Array
     */
    public static void classificationNumbers(int[] p_arrayNumbers, int p_limit) {
        int counterEven = 0, counterOdd = 0;
        for (int i = 0; i < p_limit; i++) {
            if (p_arrayNumbers[i] % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        System.out.println("The quantity of even numbers is: " + counterEven);
        System.out.println("The quantity of odd numbers is: " + counterOdd);
    }


}