package usta.sistemas;

import java.util.Scanner;

/**
 * Description: Read from the keyboard a series of numbers until you get one lower than 100
 *
 * @author Santiago Moreno
 * @version 22/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        var counter = 0;
        double sum = 0, average;
        System.out.println("Enter a number: ");
        var number = keyboard.nextInt();
        sum += number;
        counter++;

        while (number > 100) {
            System.out.println("Enter another number: ");
            number = keyboard.nextInt();
            sum += number;
            counter++;
        }
        if (counter > 0) {
            average = sum / counter;
            System.out.println("The sum of numbers entered is: " + sum + " and its average is: " + average);
        }
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------SoftNumbers_less_100-------------------╣");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 22/04/2020                       ║");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║            Created by: Santiago Moreno                   ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

}