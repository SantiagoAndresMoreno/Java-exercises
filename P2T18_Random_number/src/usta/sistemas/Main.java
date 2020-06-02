package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program generate a random number, if the entered number is equals with random number, you win
 *
 * @author Santiago Moreno
 * @version 27/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int numberWinner = getRandom();
        compareNumbers(numberWinner, getNumber());
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftRandom--------------------╣");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 27/04/2020               ║");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║         Created by: Santiago Moreno              ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /**
     * This function gets a random number between 1 and 100 and generate the tracks
     *
     * @return Integer that represent the random number
     */
    public static int getRandom() {
        int numberWinner = (int) (Math.random() * 100 + 1);
        System.out.println("---------------------------------------------");
        System.out.println("                TRACKS                       ");
        if (numberWinner % 2 == 0)
            System.out.println("1. The number is even");
        else
            System.out.println("1. The number is odd");
        if (numberWinner <= 50)
            System.out.println("2. The number is less than or equal to 50");
        else
            System.out.println("2. The number is greater than 50");
        System.out.println("---------------------------------------------");
        return numberWinner;
    }

    /**
     * This function asks the number entered for the user an valid it (the number should be between 1 and 100)
     * @return Integer that represent the number entered for the user
     */
    public static int getNumber() {
        int number;
        do {
            System.out.println("Enter a number in range 1-100 (the number should be between 1 and 100): ");
            number = keyboard.nextInt();
        } while (number < 0 || number > 100);
        return number;
    }

    /**
     * This function compares the random number with the number entered for the user and determinate if he win
     * @param p_numberWinner Integer that represent the random number generate
     * @param p_number Integer that represent the number entered for the user
     */
    public static void compareNumbers(int p_numberWinner, int p_number) {
        int counter = 1;
        while (p_numberWinner != p_number && counter < 5) {
            System.out.println("Oh, you lost! number of attempts: "+counter+":");
            p_number = getNumber();
            counter++;
        }
        if(p_numberWinner == p_number)
            System.out.println("Congratulations, you have win! the winner number is: "+ p_numberWinner);
        else
            System.out.println("You have exceeded the number of attempts! the winner number is: "+ p_numberWinner);
    }
}