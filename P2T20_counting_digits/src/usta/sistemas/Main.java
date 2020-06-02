package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program counts the digits of a entered number
 *
 * @author Santiago Moreno
 * @version 28/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        System.out.println("Enter a number to get the number of its digits: ");
        int number = keyboard.nextInt();
        getDigits(number);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------Digits Numbers--------------------╣");
        System.out.println("║══════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 28/04/2020                   ║");
        System.out.println("║══════════════════════════════════════════════════════║");
        System.out.println("║            Created by: Santiago Moreno               ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the digits's number of the entered number
     *
     * @param p_number Integer that represents the entered number
     */
    public static void getDigits(int p_number) {
        int counter = 0;
        if (p_number == 0) {
            System.out.println("The digits of this number is: 1");
        } else {
            while (p_number < -0.99 || p_number > 0.99) {
                p_number = p_number / 10;
                counter++;
            }
            System.out.println("The digits of this number is: " + counter);
        }
    }
}