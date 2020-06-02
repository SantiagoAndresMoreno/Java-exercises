package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program asks for 10 numbers and indicates the average of positive, negative numbers and the
 * quantity of zeros
 *
 * @author Santiago Moreno
 * @version 28/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        getNumbers();
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftNumbers--------------------╣");
        System.out.println("║═══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 28/04/2020                ║");
        System.out.println("║═══════════════════════════════════════════════════║");
        System.out.println("║             Created by:Santiago Moreno            ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    /**
     * This function asks for ten numbers, calculates the average of negative and positive numbers and the number of zeros
     */
    public static void getNumbers() {
        int number;
        int counterZero = 0, counterPositives = 0, counterNegatives = 0;
        double sumPositives = 0, sumNegatives = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the number " + i + ":");
            number = keyboard.nextInt();
            if (number == 0) {
                counterZero += 1;
            } else if (number < 0) {
                sumNegatives += number;
                counterNegatives += 1;
            } else {
                sumPositives += number;
                counterPositives += 1;
            }
        }
        if (counterPositives > 0) {
            System.out.println("The media of positives numbers is: " + (sumPositives / counterPositives));
        }
        if (counterNegatives > 0) {
            System.out.println("The media of negatives numbers is: " + (sumNegatives / counterNegatives));
        }
        System.out.println("The number of zeros is: " + counterZero);
    }
}